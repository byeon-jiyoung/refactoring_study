package refactoring_study.extract_class;

public class Author {
	public String authorName;
	public String authorMail;

	public Author() {
	}

	public Author(String authorName, String authorMail) {
		this.authorName = authorName;
		this.authorMail = authorMail;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorMail() {
		return authorMail;
	}

	public void setAuthorMail(String authorMail) {
		this.authorMail = authorMail;
	}
	
}