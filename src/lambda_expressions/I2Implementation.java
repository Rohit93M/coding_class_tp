package lambda_expressions;

public class I2Implementation {
	public static void main(String[] args) {
		I2 i = () -> System.out.println("Print method");
		i.print();
	}
}
