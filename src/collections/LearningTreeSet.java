package collections;

import java.util.TreeSet;

public class LearningTreeSet {
	public static void main(String[] args) {
		// Only comparable type of elements can be added to TreeSet
		TreeSet treeSet = new TreeSet();
		treeSet.add("John");
		treeSet.add("William");
		treeSet.add("James");
		System.out.println(treeSet);
	}
}
