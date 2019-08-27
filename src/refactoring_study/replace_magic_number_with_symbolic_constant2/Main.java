package refactoring_study.replace_magic_number_with_symbolic_constant2;

public class Main {
	
	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
		robot.order(Robot.COMMAND_WALK);
		robot.order(Robot.COMMAND_STOP);
		robot.order(Robot.COMMAND_JUMP);
	}
}
