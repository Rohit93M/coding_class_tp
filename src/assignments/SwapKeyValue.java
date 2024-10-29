package assignments;

import java.util.HashMap;

public class SwapKeyValue {
    public static void main(String[] args) {
    	

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 1);
        map1.put("Banana", 2);
        map1.put("Orange", 3);
        
        map1.forEach((key, value) -> 
        System.out.println("Key: " + key + ", Value: " + value));
        
        HashMap<Integer, String> map2 = new HashMap<>();

        // Swap key-value pairs using forEach and lambda expression
        map1.forEach((key, value) -> map2.put(value, key));

    
        map2.forEach((key, value) -> 
            System.out.println("Key: " + key + ", Value: " + value));
    }
}

