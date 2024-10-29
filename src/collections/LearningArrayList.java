package collections;

import java.util.ArrayList;

public class LearningArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Nitin");
		list.add(null);
		list.add(1, "Rohit");
		list.add(0);
		System.out.println(list);
	}
}
