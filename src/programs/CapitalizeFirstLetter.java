package programs;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {

		String str = "i am from tp";
		String[] strArray = str.split(" ");
		
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < strArray.length; i++) {
			// Capitalize the first letter and append the rest of the word


			if (strArray[i].length() > 0) {
				res = res.append(Character.toUpperCase(strArray[i].charAt(0)) + strArray[i].substring(1));
			}
			
			// Add space between words, except for the last word
			if (i < strArray.length) {
				res.append(" ");
			}
		}
		System.out.println(res);
	}
}
