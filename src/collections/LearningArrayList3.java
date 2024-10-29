package collections;

import java.util.ArrayList;
import java.util.Iterator;
//to access one element at a time we go for iterator, for each loop or list iterator
public class LearningArrayList3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Rose");
		list.add("Jasmine");
		list.add("Lily");
		list.add("Lotus");
		
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(((String) itr.next()).length());
		}
	}
}
