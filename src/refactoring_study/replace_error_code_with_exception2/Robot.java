package refactoring_study.replace_error_code_with_exception2;

import java.util.StringTokenizer;

//ctrl + shift + f 정렬
public class Robot { 
	private final String name;
	private final Position position = new Position(0, 0);
	private final Direction direction = new Direction(0, 1);

	public Robot(String name) {
		this.name = name;
	}

	public void execute(String commandSequence) {
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);
		try {
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				executeCommand(token);
			}
		} catch (InvalidCommandException e) {
			System.err.println("Invalid command : " + e.getMessage());
		}

	}

	public boolean executeCommand(String commandString) throws InvalidCommandException {
		Command command = Command.parseCommand(commandString);
		return executeCommand(command);
	}

	private boolean executeCommand(Command command) throws InvalidCommandException {
		if (command == Command.FORWARD) {
			position.relativeMove(direction.getX(), direction.getY());
		} else if (command == Command.BACKWARD) {
			position.relativeMove(-direction.getX(), -direction.getY());
		} else if (command == Command.TURN_RIGHT) {
			direction.setDirection(direction.getY(), -direction.getX());
		} else if (command == Command.TURN_LEFT) {
			direction.setDirection(-direction.getY(), direction.getX());
		} else {
			throw new InvalidCommandException("해당 명령은 존재하지 않음");
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("Robot [%s, %s, %s]", name, position, direction);
	}

}
