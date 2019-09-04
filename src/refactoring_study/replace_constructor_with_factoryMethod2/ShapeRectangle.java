package refactoring_study.replace_constructor_with_factoryMethod2;

public class ShapeRectangle extends Shape {
	
	public static Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeRectangle(startX, startY, endX, endY);
	}
	
	private ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
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

	@Override
	public ShapeType getTypeCode() {
		return ShapeType.RECTANGLE;
	}
}
