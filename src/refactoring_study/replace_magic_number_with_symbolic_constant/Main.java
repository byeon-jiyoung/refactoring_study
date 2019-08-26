package refactoring_study.replace_magic_number_with_symbolic_constant;

public class Main {
	
	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
//		robot.order(0); //walk
//		robot.order(1); //stop
//		robot.order(2); //jump
		
		robot.order(Robot.COMMAND_WALK);
		robot.order(Robot.COMMAND_STOP);
		robot.order(Robot.COMMAND_JUMP);
	}
}
