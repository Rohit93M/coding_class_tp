package lambda_expressions;

public class I4Implementation {
	public static void main(String[] args) {
		I4 i = (a, b) -> {
//			System.out.println(a);
//			System.out.println(b);
			return a + b;
		};
		System.out.println(i.add(3, 2));
	}
}
