package programs;

import java.util.LinkedHashSet;

public class SumPairsEqualToASpecificNo {
	public static void main(String[] args) {

		int[] a = { 10, 5, 7, 8, 6, 9, 9, 10, 7 };
		//Sum of two elements in the array should be equal to this sum
		int targetSum = 15;

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		//we don't want duplicate pairs
		for (int i = 0; i < a.length; i++) {
		//fetch one element from the array
			for (int j = i + 1; j < a.length; j++) {
				//use the remaining elements with the given element a[i]				
				String op = "";
				//every time inner loop starts op is initialized to empty string
				if (a[i] + a[j] == targetSum) {
					//formatting the output (so we can avoid duplicates and we will get the same op ex--5,10)
					op = (a[i] > a[j]) ? ("(" + a[j] + "," + a[i] + ")") : ("(" + a[i] + "," + a[j] + ")");
					//adding it to the HashSet
					set.add(op);
				}
			}
		}
		System.out.println(set);
	}
}
