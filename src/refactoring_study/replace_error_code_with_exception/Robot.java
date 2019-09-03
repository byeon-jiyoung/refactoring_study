package refactoring_study.replace_error_code_with_exception;

import java.util.StringTokenizer;

public class Robot {
	private final String name;
	private final Position position = new Position(0, 0);
	private final Direction direction = new Direction(0, 1);
	
	public Robot(String name) {
		this.name= name;
	}
	
	public void execute(String commandSequence) {
		StringTokenizer tokenizer= new StringTokenizer(commandSequence);
		while(tokenizer.hasMoreTokens()) {
			String token= tokenizer.nextToken();
			if(!executeCommand(token)) {
				System.out.println("Invalid command : "+ token);
				break;
			}
		}
	}
	
	public boolean executeCommand(String commandString) {
		Command command= Command.parseCommand(commandString);
		if(command== null) {
			return false;
		}
		return executeCommand(command);
	}
	
	private boolean executeCommand(Command command) {
		if(command== Command.FORWARD) {
			position.relativeMove(direction.getX(), direction.getY());
		}else if(command== Command.BACKWARD){
			position.relativeMove(-direction.getX(), -direction.getY());
		}else if(command== Command.TURN_RIGHT) {
			direction.setDirection(direction.getY(), -direction.getX());
		}else if(command== Command.TURN_LEFT) {
			direction.setDirection(-direction.getY(), direction.getX());
		}else{
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("Robot [%s, %s, %s]", name, position, direction);
	}
	
}
