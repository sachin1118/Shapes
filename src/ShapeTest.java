import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {

	final double EPSILON = 1e-9;
	
	@Test
	public void testArea() {
		Shape shape = new Square(3);
		assert(shape.area() == 9);
		shape = new Circle(3);
		assert(shape.area() == 9 * Math.PI);
	}
	
	@Test
	public void testRoundness() {
		Shape shape = new Square(3);
		assert(shape.isRound() == false);
		shape = new Circle(3);
		assert(shape.isRound() == true);
	}
	
	@Test
	public void testPerimeter() {
		Shape shape = new Square(3);
		assert(shape.perimeter() == 12.0);
		shape = new Circle(5);
		assert(shape.perimeter() == 2 * Math.PI * 5);
	}
	
	@Test
	public void testQualifiedCollection() {
		Shape[] shapes = {new Square(10), new Square(25), new Circle(24), new Square(17), new Circle(7)};
		int roundCount = 0;
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i].isRound()) {
				roundCount++;
			}
		}
		assert(roundCount == 2);
	}
	
	@Test
	public void testPrettyPrint() {
		Shape shape = new Square(7);
		String shapeString = shape.asString();
		assert(shapeString.equals("location: 0.0,0.0"));
	}

}
