
public abstract class Shape {
	
	double x; 
	double y;
	
	
	
	public Shape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Shape() {
		this.x = 0;
		this.y = 0;
	}

	public abstract boolean isRound();
		public abstract double area();

	public abstract double perimeter();
	
	public String asString() {
		return("location: " + this.x + "," + this.y);
	}
	
}
