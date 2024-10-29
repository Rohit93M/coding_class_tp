package programs;

public class FactorialUsingRecursion {
	
public static int recursion(int n) {
	if(n==1) {
		return 1;
	}
	int fact =n*recursion(n-1);
	return fact;
}
	
	public static void main(String[] args) {
	System.out.println(recursion(5));

	}

}
