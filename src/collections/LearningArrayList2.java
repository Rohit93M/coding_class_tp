package collections;

import java.util.ArrayList;

public class LearningArrayList2 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Rose");
		list.add("Jasmine");
		list.add("Lily");
		list.add("Lotus");

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			String str = (String) obj;
			System.out.println(str.length());
			System.out.println(((String) list.get(i)).length());
		}
	}
}
