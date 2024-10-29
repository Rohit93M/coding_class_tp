package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingSet {
	
	public static void main(String[] args) {
		LinkedHashSet<Character> set = new LinkedHashSet();
		String str = "aabbaaacccdde";
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));

//		boolean res = set.add(input.charAt(i));
//		if(res) {
//			System.out.println(input.charAt(i));
//		}
		}
System.out.println(set);
//		for (char ch : set) {
//			System.out.println(ch);
//
//		}
	}
}
