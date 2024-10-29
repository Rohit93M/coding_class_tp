package programs;

public class ReversingOrderOfWordsInSentence {
	public static void main(String[] args) {
		String str = "I am from TP";
		String rev = "";

		String[] strArray = str.split(" ");

		for (int i = strArray.length - 1; i >= 0; i--) {

			if (i == 0) {
				rev = rev + strArray[i];
			} else {
				rev = rev + strArray[i] + " ";
			}
		}
		System.out.println(rev);

	}
}
