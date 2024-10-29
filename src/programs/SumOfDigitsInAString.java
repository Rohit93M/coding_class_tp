package programs;

public class SumOfDigitsInAString {
	
	public static int sumOfDigits(String str) {
		
		int sum = 0;
//		char[] charArray = str.toCharArray();
		
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		String str = "a1b34%c5";
		System.out.println(sumOfDigits(str));
	}
}
