package refactoring_study.singleton_pattern;

public class Title { //�̱�������!!
	private static final Title instance = new Title();
	
	public static Title getInstance() { //�ܺο����� �긦 ȣ���ؾ� �Ѵ�
		return instance;
	}
	
	private Title() {} //�ܺο��� ���� ���ϰ� ���ƾ� �Ǵϱ� �ڡڡڡڡ�
	
}
