
public class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
		ourprint("hello world");
		ourprint("hello Sachin");
		System.out.println(square(2));
	}

	public static void ourprint(String msg) {
		System.out.println("Now we're going to print: ");
		System.out.println(msg);
	}

	public static double square(double x) {
		// return x * x;
		return Math.pow(x, 3);
	}
}
