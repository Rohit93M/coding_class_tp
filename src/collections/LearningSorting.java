package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearningSorting {
	//program to sort the values using Comparator interface
	public static void main(String[] args) {

		ArrayList p = new ArrayList();
		p.add(new Prayers("Monday", "Shiva", 1));
		p.add(new Prayers("Tuesday", "Hanumana", 3));
		p.add(new Prayers("Wednesday", "Ganesha", 2));

//		System.out.println(p);
//		Collections.sort(p); 
//		System.out.println(p);

		//Sorting according to numbers
//		Comparator c1 = (o1, o2) -> {
//			Prayers p1 = (Prayers) o1;
//			Prayers p2 = (Prayers) o2;
//			if (p1.num == p2.num) {
//				return 0;
//			} else if (p1.num > p2.num) {
//				return 1;
//			} else {
//				return -1;
//			}
//		};
//		System.out.println(p);
//		Collections.sort(p,c1);
//		System.out.println(p);
		
		//Sorting according to String values
		Comparator c2 = (o1,o2) -> {
			Prayers p1 = (Prayers) o1;
			Prayers p2 = (Prayers) o2;
			return p1.god.compareTo(p2.god);
		};
		    System.out.println(p);
			Collections.sort(p,c2);
			System.out.println(p);
	}
	//sort method doesn't take comparable type of value that is why we cannot implement Comparable interface using lambda expression
}