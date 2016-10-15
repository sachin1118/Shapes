
public class Main {
	public static void main(String[] args) {
		int x = 3;
		x = 2;
		if (x == 0) {
			System.out.println("x is 0");
		} else if (x == 1) {
			System.out.println("x is 1");
		} else {
			System.out.println("x is neither 0 nor 1");
		}
		ourprint("hello world");
		ourprint("hello Sachin");
		System.out.println(cube(2));
		System.out.println(max(2, 1));
		System.out.println(min(10, 6));
	}

	public static void ourprint(String msg) {
		System.out.print("Now we're going to print: ");
		System.out.println(msg);
	}

	public static double cube(double x) {
		// return x * x;
		return Math.pow(x, 3);
	}

	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static double min(double a, double b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}
