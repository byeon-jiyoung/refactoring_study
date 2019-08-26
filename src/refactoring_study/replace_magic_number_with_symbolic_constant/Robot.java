package refactoring_study.replace_magic_number_with_symbolic_constant;

public class Robot { //52p
	public static final int COMMAND_JUMP = 2;
	public static final int COMMAND_STOP = 1;
	public static final int COMMAND_WALK = 0; //public이기 때문에 main에서도 접근 가능하다
	private final String name;

	public Robot(String name) {
		super();
		this.name = name;
	}
	
	public void order(int command) {
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
