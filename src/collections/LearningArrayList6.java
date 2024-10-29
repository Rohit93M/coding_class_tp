package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LearningArrayList6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Rose");
		list.add("Lily");
		list.add("Lotus");

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).length());
//		}

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().length());
		}

//		ListIterator<String> listItr = list.listIterator(3);
//		while (listItr.hasPrevious()) {
//			System.out.println(listItr.previous().length());
//		}

//		for (String str : list) {
//			System.out.println(str.length());
//		}
	}
}
