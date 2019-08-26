package refactoring_study.replace_magic_number_with_symbolic_constant;

public class Robot {
	private final String name;

	public Robot(String name) {
		super();
		this.name = name;
	}
	
	public void order(int command) {
		if(command == 0) {
			System.out.printf("%s %s%n", name, "walks.");
		}else if(command == 1) {
			System.out.printf("%s %s%n", name, "stops.");
		}else if(command == 2) {
			System.out.printf("%s %s%n", name, "jumps.");
		}else {
			System.out.printf("command error. command = %s%n", command);
		}
	}
}
