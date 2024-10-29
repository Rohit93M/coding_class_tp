package patterns;

public class NumberPyramidWithSpaces {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {

			// print space
			for (int j = n - i; j >= 1; j--) {
				System.out.print("  ");
			}

			// print increasing numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			// print decreasing numbers
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
}
