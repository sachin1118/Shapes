
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
		
		
		int n = 0;
		while(n < 5) {
			n = n + 1;
			System.out.println(n);
		}
		
		System.out.println(square(2));
		System.out.println(max(2, 1));
		System.out.println(min(10, 6));
		System.out.println(factorial(5));
		System.out.println(factorial2(5));
		System.out.println(factorialRecursive(5));
		System.out.println(factorial3(6));
		System.out.println(listExample());
	}
	
	public static String listExample() {
		String [] elements = {"H", "He", "Li", "Be", "B", "C", "N", "O"};
		String blob = "";
		for(int i = 0; i < elements.length; i++) {
			if (i == 0) {
				blob = blob + elements[i];
			} else {
				blob = blob +  "\n" + elements[i];
			}
			
		
		}
		return blob;
	}

	public static void ourprint(String msg) {
		System.out.print("Now we're going to print: ");
		System.out.println(msg);
	}

	/**
	 * Computes the square of x
	 * @param x
	 * @return
	 */
	
	public static double square(double x) {
		// return x * x;
		return Math.pow(x, 2);
	}

	/**
	 * Returns the larger number from a and b
	 * @param a
	 * @param b
	 * @return
	 */
	
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	/**
	 * Returns the smaller number from a and b
	 * @param a
	 * @param b
	 * @return
	 */
	
	public static double min(double a, double b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
	
	/**
	 * Computes the factorial of n (n * (n - 1) *  (n - 2)... * 1)
	 * @param n
	 * @return
	 */
	
	public static int factorial(int n) {
		int total = 1;
		while (n > 1) {
			total = total * n;
			n = n - 1;
		}
		return total;
	}
	
	/**
	 * Computes factorial of n (1 * 2 * 3... * n)
	 * @param n
	 * @return
	 */
	
	public static int factorial2(int n) {
		int total = 1;
		int k = 1;
		while (k <= n) {
			total = total * k;
			k++;
		}
		return total;
	}
	
	/**
	 * Computes the factorial of n using a recursive function
	 * @param n
	 * @return
	 */
	
	
	public static int factorialRecursive(int n) {
		if (n < 1) {
			return 1;
		}
		return n * factorialRecursive(n - 1);
	}
	
	public static int factorial3(int n) {
		int total = 1;
		for (int k = 1; k <= n; k++) {
			total  *= k;
		}
		return total;
	}
}
