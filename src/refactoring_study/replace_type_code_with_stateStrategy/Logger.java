package refactoring_study.replace_type_code_with_stateStrategy;

public class Logger {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	
	private int state;
	
	public Logger() {
		this.state= STATE_STOPPED;
	}
	
	public void start() {
		switch(state) {
			case STATE_STOPPED:
				System.out.println("** START LOGGING **");
				state = STATE_LOGGING;
				break;
			case STATE_LOGGING:
				/*아무것도하지않음*/
				break;
			default:
				System.out.println("Invalid state : "+ state);
		}
	}
	
	public void stop() {
		switch(state) {
		case STATE_STOPPED:
			/*아무것도하지않음*/
			break;
		case STATE_LOGGING:
			System.out.println("** STOP LOGGING **");
			state = STATE_STOPPED;
			break;
		default:
			System.out.println("Invalid state : "+ state);
		}
	}
	
	public void log(String info) {
		switch(state) {
			case STATE_STOPPED:
				System.out.println("Ignoring: "+ info);
				break;
			case STATE_LOGGING:
				System.out.println("Logging: "+ info);
				break;
			default:
				System.out.println("Invalid state : "+ state);
		}
	}
}
