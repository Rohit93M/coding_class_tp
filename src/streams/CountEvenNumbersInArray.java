package streams;

import java.util.Arrays;

public class CountEvenNumbersInArray {
	
	public static void main(String[] args) {
		int[] a = { 12, 34, 45, 23, 89, 87, 100 };
		long num = Arrays.stream(a)
				.filter((n) -> n % 2 == 0)
				.count();
		System.out.println(num);

		int[] evenNum = Arrays.stream(a)
				.filter((n) -> n % 2 == 0)
				.toArray();
		System.out.println(Arrays.toString(evenNum));
		
		//using filter method we can find even number in array for that method we have to write the condition
		//filter method is present in intStream class
		//which accepts parameter as IntPredicate functional interface reference 
		//inside that test(value) will return boolean where we have to provide the implementation.
		
	}
}
