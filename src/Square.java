
public class Square extends Shape {
	double length;

	public Square(double length) {
		super();
		this.length = length;
	}
	
	public double area () {
		return this.length * this.length;
	}
	
	public boolean isRound() {
		return false;
	}
	
	public double perimeter() {
		return this.length * 4.0;
	}
	
}
