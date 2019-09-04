package refactoring_study.replace_constructor_with_factoryMethod2;

public class ShapeFactoryProvider {
	public static Shape createShape(ShapeType typecode, int startx, int starty, int endx, int endy) {
		switch (typecode) {
		case LINE: //�������̴ϱ� �̷��� ���� �� �ִ°Ŵ�
//			return new ShapeLine(startx, starty, endx, endy);
//			ShapeLine���� �Լ��� ����� �����ڸ� private�߱� ������ ���⼭ new�� �� ����.
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
