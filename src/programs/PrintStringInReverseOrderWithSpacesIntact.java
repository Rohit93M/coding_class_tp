package programs;

public class PrintStringInReverseOrderWithSpacesIntact {
	public static void main(String[] args) {
		String withSpace = "I love veg biryani";
		String withoutSpace = withSpace.replace(" ", "");

		int lastIndex = withoutSpace.length() - 1;
		for (int i = 0; i < withSpace.length(); i++) {
			if (withSpace.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print(withoutSpace.charAt(lastIndex--));
			}
		}
	}
}
