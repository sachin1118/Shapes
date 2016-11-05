
public class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public boolean isRound() {
		return true;
	}
	
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
}
