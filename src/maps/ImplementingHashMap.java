package maps;

import java.util.HashMap;

public class ImplementingHashMap {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
        hm.put("Dinesh", "Amazon");
        hm.put("Shiv", "IBM");
        hm.put("Shabana", "Sony");
        hm.put("Sejal", "IBM");
        
        hm.forEach((key,value)->{
        	System.out.println(key+":"+value);
        });
	}
}
//providing multiple implementations is easy in case of Lambda Expression
// non-generic collections can be fetched using forEach method, generic collections-entrySet
