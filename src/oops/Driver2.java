package oops;

public class Driver2 {
	public static void main(String[] args) {
		
//		Dell dell = new Dell();
//		dell.project();
//		
//		HP hp = new HP();
//		hp.project();
		
		AbstractProjector abstractProjector = new Dell();
		abstractProjector.project();
		
		abstractProjector = new HP();
		abstractProjector.project();
	}
}
