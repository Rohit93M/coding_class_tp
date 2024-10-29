package programs;

public class PrintAllSubstrings {
	
public static void main(String[] args) {
	
	String str = "INDIA";
	for(int i=0; i<str.length(); i++) {

		String substr = "";
		for(int j=i; j<str.length();j++) {
			substr = substr + str.charAt(j);
			System.out.println(substr);
		}
	}
}
}
