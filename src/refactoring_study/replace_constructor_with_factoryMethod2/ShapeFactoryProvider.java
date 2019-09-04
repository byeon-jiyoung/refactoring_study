package refactoring_study.replace_constructor_with_factoryMethod2;

public class ShapeFactoryProvider {
	public static Shape createShape(ShapeType typecode, int startx, int starty, int endx, int endy) {
		switch (typecode) {
		case LINE: //열거형이니까 이렇게 적을 수 있는거다
//			return new ShapeLine(startx, starty, endx, endy);
//			ShapeLine에서 함수를 만들고 생성자를 private했기 때문에 여기서 new할 수 없다.
			return ShapeLine.create(startx, starty, endx, endy);
		case RECTANGLE:
//			return new ShapeRectangle(startx, starty, endx, endy);
			return ShapeRectangle.create(startx, starty, endx, endy);
		case OVAL:
//			return new ShapeOval(startx, starty, endx, endy);
			return ShapeOval.create(startx, starty, endx, endy);
		case TRIANGLE:
			return ShapeTriangle.create(startx, starty, endx, endy);
		default:
			return null;
		}
	}
}
