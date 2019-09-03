package refactoring_study.replace_error_code_with_exception3;

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

	public void executeCommand(String commandString) throws InvalidCommandException {
		Command command = Command.parseCommand(commandString);
		command.execute(this);
	}

	//alt + shift + m으로 함수생성 가능
	public void left() {
		direction.setDirection(-direction.getY(), direction.getX());
	}

	public void right() {
		direction.setDirection(direction.getY(), -direction.getX());
	}

	public void backward() {
		position.relativeMove(-direction.getX(), -direction.getY());
	}

	public void forward() {
		position.relativeMove(direction.getX(), direction.getY());
	}

	@Override
	public String toString() {
		return String.format("Robot [%s, %s, %s]", name, position, direction);
	}

}
