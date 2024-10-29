package collections;

import java.util.ArrayList;

public class ImplementingForEach {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Rose");
		list.add("Jasmine");
		list.add("Lily");
		list.add("Lotus");
        // forEach() method is another way of accessing elements from List and Set
		// lambda expression takes a Consumer interface type of reference
		// internally forEach method will call the accept method and it will perform the
		// action
		list.forEach((a) -> System.out.println(a));
		list.forEach((a) -> System.out.println(a.length()));

	}
}
