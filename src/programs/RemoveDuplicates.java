package programs;

import java.util.LinkedHashMap;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String str = "aabbaaccbbddae";
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (lhm.containsKey(ch)) {
				lhm.put(ch, lhm.get(ch) + 1);
			} else
				lhm.put(ch, 1);
		}
		for (char ch : lhm.keySet()) {
			System.out.println(ch);
		}
	}
}
