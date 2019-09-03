package refactoring_study.replace_error_code_with_exception;

public class Main {
	
	public static void main(String[] args) {
		Robot robot= new Robot("Andrew");
		System.out.println(robot);
		
		robot.execute("forward right forward");
		System.out.println(robot);
		
		robot.execute("left backward left forward");
		System.out.println(robot);
		
		robot.execute("right forward forward farvard");
		System.out.println(robot);
	}
}