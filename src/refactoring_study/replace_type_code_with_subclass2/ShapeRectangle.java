package refactoring_study.replace_type_code_with_subclass2;

public class ShapeRectangle extends Shape {
	
	public ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}
	
	@Override
	public int getTypeCode() {
		return Shape.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}

	@Override
	public void draw() {
		drawRectangle();
	}
	
	private void drawRectangle() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());
	}
}
