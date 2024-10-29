package maps;

import java.util.TreeMap;

public class LearningTreeMap {
public static void main(String[] args) {
	TreeMap tm = new TreeMap();
	tm.put(100, "John");
	tm.put(10, 'a');
	tm.put(45, null);
	
	System.out.println(tm);
	
     tm.forEach((key,value)->{
    	System.out.println(key+":"+value);
    });
	
			}
}
