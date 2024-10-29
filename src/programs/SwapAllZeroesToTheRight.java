package programs;

import java.util.Arrays;

public class SwapAllZeroesToTheRight {

	public static void main(String[] args) {
		int[] a = {3,0,4,0,8};

		int nzp = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] != 0) {
				a[nzp] = a[i];
				nzp++;
			}
		}
		
		while (nzp <= a.length-1) {
			a[nzp] = 0;
			nzp++;
		}
		System.out.println(Arrays.toString(a));
	}
}
