package maps;

import java.util.HashMap;

public class LearningHashMap {
public static void main(String[] args) {
	HashMap hashMap = new HashMap();
	hashMap.put(100, "John");
	hashMap.put(10, 'a');
	hashMap.put(null, 45);
	hashMap.put(45, null);
	
	System.out.println(hashMap);
	
			}
}
