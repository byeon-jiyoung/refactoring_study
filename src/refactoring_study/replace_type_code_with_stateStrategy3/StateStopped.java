package refactoring_study.replace_type_code_with_stateStrategy3;

public class StateStopped extends State {
	private static final StateStopped instance = new StateStopped(); //싱글톤
	
	public static StateStopped getInstance() {
		return instance;
	}
	
	private StateStopped() {} //다른데서 생성하지 못하도록 생성자에 private붙이는게 싱글톤의 정석!!
	
	@Override
	public void start(Logger logger) {
		System.out.println("** START LOGGING **");
		logger.setState(StateLogging.getInstance());
	}

	@Override
	public void stop(Logger logger) {
		/* 아무것도 하지 않음 */
	}

	@Override
	public void log(String info) {
		System.out.println("Logging: "+ info);
	}

}
