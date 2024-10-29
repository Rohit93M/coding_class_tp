package lambda_expressions;

public class I3Implementation {
	public static void main(String[] args) {
		I3 i = (a,b) -> System.out.println(a+b);
		i.add(3,2);
	}
}
