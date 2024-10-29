package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class LearningArrayList4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Rose");
		list.add("Jasmine");
		list.add("Lily");
		list.add("Lotus");

		ListIterator litr = list.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("==================================");

		ListIterator litr1 = list.listIterator();

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
