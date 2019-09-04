package refactoring_study.replace_constructor_with_factoryMethod2;

public class ShapeLine extends Shape {
	
	public static Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeLine(startX, startY, endX, endY);
	}
	
	private ShapeLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
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

	@Override
	public ShapeType getTypeCode() {
		return ShapeType.LINE;
	}
}
