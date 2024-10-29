package collections;

import java.util.ArrayList;

public class ImplementingForEach2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		
		list.forEach((a)-> {
			if(a%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("Odd");
			}
		});
	}
}
/*
Adv. : Lambda expression can be given as an input to another method
In the traditional approach, 2 or 3 implementation class has to be given but in case of Lambda expression you can give the
method implementation in the runner class
*/