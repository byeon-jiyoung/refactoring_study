package refactoring_study.replace_magic_number_with_symbolic_constant2;

public class RobotCommand { //58p
	private final String name;

	public RobotCommand(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("[RobotCommand: %s]", name);
	}
	
	
}
