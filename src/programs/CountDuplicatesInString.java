package programs;

public class CountDuplicatesInString {

	public static void main(String[] args) {
		String s = "1aa444xxx33";
		char[] ch = s.toCharArray();
		boolean[] b = new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[j] == ch[i]) {
						count++;
						b[j] = true;
					}
				}
					System.out.println(ch[i] + "  " + count);
			}
		}
	}
}
