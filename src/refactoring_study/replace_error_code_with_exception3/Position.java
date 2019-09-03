package refactoring_study.replace_error_code_with_exception3;

public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void relativeMove(int dx, int dy) {
		this.x+= dx;
		this.y+= dy;
	}

	@Override
	public String toString() {
		return String.format("Position(%s, %s)", x, y);
	}
	
}
