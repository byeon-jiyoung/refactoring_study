package refactoring_study.introduce_null_object;

public class Person {
	private final Label name;
	private final Label mail;
	
	public Person(Label name, Label mail) {
		this.name = name;
		this.mail = mail;
	}
	
	public Person(Label name) {
//		this(name, null);
//		this(name, new NullLabel());
		this(name, Label.newNull());
	}

	
	public Label getName() {
		return name;
	}

	public Label getMail() {
		return mail;
	}

	public void display() {
		/*
		if(name != null) {
			name.display();
		}
		if(mail != null) {
			mail.display();
		}
		*/
		name.display();
		mail.display();
	}
	
	@Override
	public String toString() {
		/*
		String result = "[ Person: ";
		
		result += " name=";
		if(name == null) {
			result += "\"(none)\"";
		}else {
			result += name;
		}
		
		result += " mail=";
		if(mail == null) {
			result += "\"(none)\"";
		}else {
			result += mail;
		}
		
		result += " ]";
		
		return result;
		*/
		return String.format("Person [name=%s, mail=%s]", name, mail);
	}
	
}
