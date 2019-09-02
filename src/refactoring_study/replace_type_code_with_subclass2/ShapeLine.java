package refactoring_study.replace_type_code_with_subclass2;

public class ShapeLine extends Shape {
	
	public ShapeLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}
	
	@Override
	public int getTypeCode() {
		return Shape.TYPECODE_LINE;
	}

	@Override
	public String getName() {
		return "LINE";
	}

	@Override
	public void draw() {
		drawLine();
	}
	
	private void drawLine() {
		System.out.printf("%15s : %s%n", "drawLine", this.toString());
	}
}
