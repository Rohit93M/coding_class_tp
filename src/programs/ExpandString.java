package programs;

public class ExpandString {
	public static void main(String[] args) {
		String str = "a2b2a2c1d3";
		for (int i = 0; i < str.length(); i = i + 2) {
			char alpha =str.charAt(i);
			int count = str.charAt(i + 1) - 48;
			for (int j = 1; j <= count; j++) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
