package refactoring_study.replace_type_code_with_subclass2;

public class ShapeOval extends Shape {
	
	public ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}
	
	@Override
	public int getTypeCode() {
		return Shape.TYPECODE_OVAL;
	}

	@Override
	public String getName() {
		return "OVAL";
	}

	@Override
	public void draw() {
		drawOval();
	}
	
	private void drawOval() {
		System.out.printf("%15s : %s%n", "drawOval", this.toString());
	}
}
