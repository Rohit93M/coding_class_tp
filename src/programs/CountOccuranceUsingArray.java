package programs;

public class CountOccuranceUsingArray {

	public static void main(String[] args) {

		String str = "aaabcdfzzeec";
		int[] count = new int[256]; // Assuming ASCII
		for (char ch : str.toCharArray()) {
			count[ch]++;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (count[c] != 0) {
				System.out.println(c + " occurs " + count[c] + " times");
				count[c] = 0; // reset to avoid printing duplicates
			}

			// unique
			if (count[c] == 1) {
				System.out.println(c + " unique");
			}

			// duplicate
			if (count[c] > 1) {
				System.out.println(c + " duplicate");
				count[c] = 0;
			}
		}
	}
}
