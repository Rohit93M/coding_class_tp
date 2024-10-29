package patterns;

public class StarPyramidWithSpace {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			
			// print space
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			// print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
