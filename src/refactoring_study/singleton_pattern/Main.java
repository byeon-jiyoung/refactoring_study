package refactoring_study.singleton_pattern;

public class Main {
	public static void main(String[] args) {
//		Title t1 = new Title();
//		Title t2 = new Title(); 생성자가 private라서 이렇게 할 수 없다
		
		Title t1 = Title.getInstance();
		Title t2 = Title.getInstance();
		//몇번을 실행해도 같은 주소만 나온다. 같은 객체
		
		System.out.println(t1 + "\n" + t2);
	}
}
