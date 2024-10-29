package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Run {
	
	public static void main(String[] args) {
		ArrayList<Pen> aL = new ArrayList();
		aL.add(new Pen("Camlin", 35));
		aL.add(new Pen("Parker", 150));
		aL.add(new Pen("Cello", 15));

		Collections.sort(aL);
		System.out.println(aL);

	}
}
