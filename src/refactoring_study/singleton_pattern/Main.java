package refactoring_study.singleton_pattern;

public class Main {
	public static void main(String[] args) {
//		Title t1 = new Title();
//		Title t2 = new Title(); �����ڰ� private�� �̷��� �� �� ����
		
		Title t1 = Title.getInstance();
		Title t2 = Title.getInstance();
		//����� �����ص� ���� �ּҸ� ���´�. ���� ��ü
		
		System.out.println(t1 + "\n" + t2);
	}
}
