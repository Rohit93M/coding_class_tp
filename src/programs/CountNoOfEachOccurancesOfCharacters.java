package programs;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfEachOccurancesOfCharacters {
	public static void main(String[] args) {
		String str = "aadabcbdccezc";
		Map<Character, Integer> countMap = new HashMap();
		for (int i = 0; i < str.length(); i++) {
			
//			if (countMap.containsKey(str.charAt(i))) {
//				int count = countMap.get(str.charAt(i));
//				countMap.put(str.charAt(i), count + 1);
//				
//			} else {
//				countMap.put(str.charAt(i), 1); // We have taken default value as 1
//			}
			
			countMap.put(str.charAt(i), countMap.getOrDefault(str.charAt(i), 0) + 1);
		}
		System.out.println(countMap);
		
		
		//Unique
		int count=0;
		for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				count++;
			}
		}
		System.out.println(count);
		System.out.println("==========================================");
		
		//Duplicates
		int count1=0;
		for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
				count1++;
			}
		}
		System.out.println(count1);
	}
}
