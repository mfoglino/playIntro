package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(4,6);
			
		List<ShapeArea> shapes = new ArrayList<ShapeArea>();
		shapes.add(c);
		shapes.add(r);
		
		for (ShapeArea shapeArea : shapes) {
			System.out.println("El area es:"+ shapeArea.area());
		}
	}
}
