package refactoring_study.replace_magic_number_with_symbolic_constant3;

import refactoring_study.replace_magic_number_with_symbolic_constant2.RobotCommand;

public class Robot {
	private final String name;
	public enum Command {
		WALK, STOP, JUMP,
	}
	
	public Robot(String name) {
		super();
		this.name = name;
	};
	
	public void order(Robot.Command command) {
		if(command == Command.WALK) {
			System.out.printf("%s %s%n", name, "walks.");
		}else if(command == Command.STOP) {
			System.out.printf("%s %s%n", name, "stops.");
		}else if(command == Command.JUMP) {
			System.out.printf("%s %s%n", name, "jumps.");
		}else {
			System.out.printf("command error. command = %s%n", command);
		}
	}
}
