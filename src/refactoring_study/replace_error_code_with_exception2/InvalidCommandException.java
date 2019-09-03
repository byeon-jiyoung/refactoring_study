package refactoring_study.replace_error_code_with_exception2;

@SuppressWarnings("serial")
public class InvalidCommandException extends Exception { //직접 예외처리를 만드는거
	
	//alt + shift + s 중에 아무것도 없는거랑 string만 있는거랑 체크하면 됨
	
	public InvalidCommandException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidCommandException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
