package programs;

import java.util.Arrays;

public class Anagrams {

	public static boolean areAnagrams(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);
		}

	}

	public static void main(String[] args) {
		String s1 = "EATEN";
		String s2 = "ACT";
		System.out.println(areAnagrams(s1, s2));
	}
}
