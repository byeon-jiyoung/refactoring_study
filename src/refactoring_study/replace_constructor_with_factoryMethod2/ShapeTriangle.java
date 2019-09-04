package refactoring_study.replace_constructor_with_factoryMethod2;

public class ShapeTriangle extends Shape {
	
	public static Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeTriangle(startX, startY, endX, endY);
	}
	
	private ShapeTriangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public String getName() {
		return "TRIANGLE";
	}

	@Override
	public void draw() {
		drawTriangle();
	}
	
	private void drawTriangle() {
		System.out.printf("%15s : %s%n", "drawTriangle", this.toString());
	}

	@Override
	public ShapeType getTypeCode() {
		return ShapeType.TRIANGLE;
	}
}
