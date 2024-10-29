package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearningMethodsOfMap {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap();
		hashMap.put("Abhishek", "Aish");
		hashMap.put("Virat", "Anushka");
		hashMap.put("Ranveer", "Deepika");

	//	System.out.println(hashMap);
	//	hashMap.remove("Ranveer");
	//	System.out.println(hashMap);
	//	hashMap.remove("Abhishek", "Aish");
		System.out.println(hashMap);
	//	hashMap.clear();
	//	System.out.println(hashMap);
		
		System.out.println(hashMap.containsKey("Virat"));
		System.out.println(hashMap.containsValue("Aish"));
		
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		
		hashMap.replace("Ranveer", "DP");
		System.out.println(hashMap);
		hashMap.replace("Ranveer", "DP","Deepika");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get("Abhishek"));
		System.out.println("Dhoni");
		System.out.println(hashMap.getOrDefault("Dhoni","Shakshi"));//if the key is not present or value is not present you can set the value
		
		for(Map.Entry<String, String> map : hashMap.entrySet()) {
			//if i want to use entrySet() the map should be of generic collection
			System.out.println(map.getKey()+":"+map.getValue());
		}
	}
}
