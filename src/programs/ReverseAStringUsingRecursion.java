package programs;

public class ReverseAStringUsingRecursion {

	public static String reverse(String str) {

		String rev = "";
		if (str.isEmpty()) {
			return str;
		}
		rev = reverse(str.substring(1)) + str.charAt(0);
		return rev;
	}

	public static void main(String[] args) {
		String str = "INDIA";
		System.out.println(reverse(str));
	}
}
