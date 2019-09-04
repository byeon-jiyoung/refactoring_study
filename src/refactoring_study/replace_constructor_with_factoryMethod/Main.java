package refactoring_study.replace_constructor_with_factoryMethod;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Shape> shapes= Arrays.asList(
			new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200),
			new Shape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40),
			new Shape(Shape.TYPECODE_OVAL, 100, 200, 300, 400)
		);
		
		for(Shape s: shapes) {
			s.draw();
		}
	}
}
