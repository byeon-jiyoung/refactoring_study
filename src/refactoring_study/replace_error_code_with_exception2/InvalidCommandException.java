package refactoring_study.replace_error_code_with_exception2;

@SuppressWarnings("serial")
public class InvalidCommandException extends Exception { //���� ����ó���� ����°�
	
	//alt + shift + s �߿� �ƹ��͵� ���°Ŷ� string�� �ִ°Ŷ� üũ�ϸ� ��
	
	public InvalidCommandException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidCommandException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
