package collections;

import java.util.HashSet;

public class LearningHashSet {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add("Simba");
		hashSet.add('a');
		hashSet.add(10.7);
		for (Object o : hashSet) {
			System.out.println(o);
		}
	}
}
