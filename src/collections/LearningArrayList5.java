package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class LearningArrayList5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Rose");
		list.add("Jasmine");
		list.add("Lily");
		list.add("Lotus");
		
		for(Object o: list) {
			System.out.println(o);
		}


	}

}
