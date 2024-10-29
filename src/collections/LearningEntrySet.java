package collections;

import java.util.HashMap;
import java.util.Map;

public class LearningEntrySet {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("abc", 10);
		map.put("efg", 20);
		map.put("xyz", 40);
		map.put("jkl", 30);
		for (Map.Entry<String, Integer> var : map.entrySet()) {
			System.out.println(var.getKey() +" "+ var.getValue());
		}
	}
}
