package collections;

import java.util.TreeSet;

public class LearningTreeSet2 {
	public static void main(String[] args) {
		// Only comparable type of elements can be added to TreeSet
		TreeSet treeSet = new TreeSet();
		treeSet.add(new Student());
		treeSet.add(new Student());

		System.out.println(treeSet);
	}
}

class Student implements Comparable {

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

