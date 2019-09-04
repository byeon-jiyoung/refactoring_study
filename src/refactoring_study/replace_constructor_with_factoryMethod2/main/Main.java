package refactoring_study.replace_constructor_with_factoryMethod2.main;

import java.util.Arrays;
import java.util.List;

import refactoring_study.replace_constructor_with_factoryMethod2.Shape;
import refactoring_study.replace_constructor_with_factoryMethod2.ShapeFactoryProvider;
import refactoring_study.replace_constructor_with_factoryMethod2.ShapeType;

public class Main {
	
	public static void main(String[] args) {
		List<Shape> shapes= Arrays.asList(
			ShapeFactoryProvider.createShape(ShapeType.LINE, 0, 0, 100, 200),
			ShapeFactoryProvider.createShape(ShapeType.RECTANGLE, 10, 20, 30, 40),
			ShapeFactoryProvider.createShape(ShapeType.OVAL, 100, 200, 300, 400),
			ShapeFactoryProvider.createShape(ShapeType.TRIANGLE, 100, 200, 300, 400)
			//shapeType 추가, shapeTriangle 생성, ShapeFactoryProvider 추가만 하면 트라이앵글이 추가된다. 추가가 쉬워짐
		);
		
		for(Shape s: shapes) {
			s.draw();
		}
	}
}
