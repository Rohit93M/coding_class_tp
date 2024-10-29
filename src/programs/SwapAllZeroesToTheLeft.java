package programs;

import java.util.Arrays;

public class SwapAllZeroesToTheLeft {
	
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 5 };
		int nzp = arr.length - 1;
		for (int i = nzp; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[nzp] = arr[i];
				nzp--;
			}
		}
		while (nzp >= 0) {
			arr[nzp] = 0;
			nzp--;
		}
		System.out.println(Arrays.toString(arr));
	
	}
}
