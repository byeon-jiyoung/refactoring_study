package refactoring_study.singleton_pattern;

public class Title { //싱글톤패턴!!
	private static final Title instance = new Title();
	
	public static Title getInstance() { //외부에서는 얘를 호출해야 한다
		return instance;
	}
	
	private Title() {} //외부에서 생성 못하게 막아야 되니까 ★★★★★
	
}
