package refactoring_study.replace_type_code_with_stateStrategy2;

public class Logger {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	
	private State state;
	
	public int getState() {
		return state.getTypeCode();
	}

	public void setState(int state) {
		switch (state) {
		case STATE_STOPPED:
			this.state = new StateStopped();
			break;
		case STATE_LOGGING:
			this.state = new StateLogging();
			break;
		default:
			System.out.println("Invalid state : "+ state);
		}
	}

	public Logger() {
		setState(STATE_STOPPED);
	}
	
	public void start() {
		switch(getState()) {
			case STATE_STOPPED:
				System.out.println("** START LOGGING **");
				setState(STATE_LOGGING);
				break;
			case STATE_LOGGING:
				/*아무것도하지않음*/
				break;
			default:
				System.out.println("Invalid state : "+ state);
		}
	}
	
	public void stop() {
		switch(getState()) {
		case STATE_STOPPED:
			/*아무것도하지않음*/
			break;
		case STATE_LOGGING:
			System.out.println("** STOP LOGGING **");
			setState(STATE_STOPPED);
			break;
		default:
			System.out.println("Invalid state : "+ state);
		}
	}
	
	public void log(String info) {
		switch(getState()) {
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
