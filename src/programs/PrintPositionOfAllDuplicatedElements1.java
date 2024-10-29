package programs;

public class PrintPositionOfAllDuplicatedElements1 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 2, 3, 3, 4};
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					b[j] = true;
				}
			}
			if (b[i] == true) {
				System.out.println(a[i] + "  " + i);
			}
		}
	}
}
