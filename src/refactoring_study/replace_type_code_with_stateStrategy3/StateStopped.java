package refactoring_study.replace_type_code_with_stateStrategy3;

public class StateStopped extends State {
	private static final StateStopped instance = new StateStopped(); //�̱���
	
	public static StateStopped getInstance() {
		return instance;
	}
	
	private StateStopped() {} //�ٸ����� �������� ���ϵ��� �����ڿ� private���̴°� �̱����� ����!!
	
	@Override
	public void start(Logger logger) {
		System.out.println("** START LOGGING **");
		logger.setState(StateLogging.getInstance());
	}

	@Override
	public void stop(Logger logger) {
		/* �ƹ��͵� ���� ���� */
	}

	@Override
	public void log(String info) {
		System.out.println("Logging: "+ info);
	}

}
