package programs;

public class SwapTwoStringsWithoutExtraVar {
public static void swap(String a, String b) {
}

public static void main(String[] args) {
	String a = "Hello";
	String b = "World";//b.length()=5
	a = a+b;
	System.out.println(a);//HelloWorld

	b=a.substring(0, a.length()-b.length());//a.length()=10,b.length()=5
	System.out.println(b);//Hello,b.length()=5
	
	a=a.substring(b.length());
	
	System.out.println(a);
}
}
