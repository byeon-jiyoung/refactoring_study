package refactoring_study.replace_magic_number_with_symbolic_constant2;

public class Robot {
	private final String name;
	public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
	public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
	public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
	
	public Robot(String name) {
		super();
		this.name = name;
	}
	
	public void order(RobotCommand command) {
		if(command == COMMAND_WALK) {
			System.out.printf("%s %s%n", name, "walks.");
		}else if(command == COMMAND_STOP) {
			System.out.printf("%s %s%n", name, "stops.");
		}else if(command == COMMAND_JUMP) {
			System.out.printf("%s %s%n", name, "jumps.");
		}else {
			System.out.printf("command error. command = %s%n", command);
		}
	}
}
