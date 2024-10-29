package programs;

public class FactorialOfANumber {
	
	public static int factorial(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(factorial(n));
	}
}
