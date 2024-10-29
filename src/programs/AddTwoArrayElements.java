package programs;

import java.util.Arrays;

public class AddTwoArrayElements {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6, 7 };
		
		int[] result = new int[Math.max(a.length, b.length)];

		for (int i = 0; i < result.length; i++) {
			if (i < a.length) {
				result[i] = result[i] + a[i];
			}

			if (i < b.length) {
				result[i] = result[i] + b[i];
			}
		}
		System.out.println(Arrays.toString(result));

	}
}
