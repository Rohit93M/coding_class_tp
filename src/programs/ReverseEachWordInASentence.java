package programs;

public class ReverseEachWordInASentence {
	public static void main(String[] args) {
		String input = "Welcome to tp office";
		String[] strArray = input.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			StringBuilder sb = new StringBuilder(strArray[i]);
			sb.reverse();
			System.out.print(sb + " ");
		}
	}
}
