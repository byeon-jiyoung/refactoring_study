package refactoring_study.replace_type_code_with_stateStrategy3;

public class StateLogging extends State {
	private static final StateLogging instance = new StateLogging(); //�̱���
	
	public static StateLogging getInstance() {
		return instance;
	}
	
	private StateLogging() {} //�ٸ����� �������� ���ϵ��� �����ڿ� private���̴°� �̱����� ����!!
	
	@Override
	public void start(Logger logger) {
		/* �ƹ��͵� ���� ���� */
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
