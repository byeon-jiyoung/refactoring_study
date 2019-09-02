package refactoring_study.replace_type_code_with_stateStrategy3;

public class StateLogging extends State {
	private static final StateLogging instance = new StateLogging(); //싱글톤
	
	public static StateLogging getInstance() {
		return instance;
	}
	
	private StateLogging() {} //다른데서 생성하지 못하도록 생성자에 private붙이는게 싱글톤의 정석!!
	
	@Override
	public void start(Logger logger) {
		/* 아무것도 하지 않음 */
	}

	@Override
	public void stop(Logger logger) {
		System.out.println("** STOP LOGGING **");
		logger.setState(StateStopped.getInstance());
	}

	@Override
	public void log(String info) {
		System.out.println("Logging: "+ info);
	}

}
