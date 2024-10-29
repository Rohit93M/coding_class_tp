package programs;

public class CountCharacterRuns {

	public static String countSequence(String str) {
		
		StringBuilder res = new StringBuilder();
		
		int count = 1;
		
		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				res.append(str.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		
		res.append(str.charAt(str.length() - 1)).append(count);
		return res.toString();
	}

	public static void main(String[] args) {
		String str = "aabbabac";
		System.out.println(countSequence(str));
	}
}
