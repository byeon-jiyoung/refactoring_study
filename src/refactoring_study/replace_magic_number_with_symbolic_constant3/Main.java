package refactoring_study.replace_magic_number_with_symbolic_constant3;

public class Main {
	
	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
		robot.order(Robot.Command.WALK);
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
	}
}
