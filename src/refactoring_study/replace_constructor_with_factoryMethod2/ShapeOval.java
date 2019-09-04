package refactoring_study.replace_constructor_with_factoryMethod2;

public class ShapeOval extends Shape {
	
	public static Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeOval(startX, startY, endX, endY);
	}
	
	private ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
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

	@Override
	public ShapeType getTypeCode() {
		return ShapeType.OVAL;
	}
}
