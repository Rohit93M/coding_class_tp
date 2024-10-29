package programs;

public class SwapFirstAndLastWords {

	public static void main(String[] args) {
		String s="India";
		StringBuilder sb=new StringBuilder();
	//	String rev=s.substring(s.length()-1)+s.substring(1,s.length()-1)+s.substring(0,1);
	//	System.out.println(rev);
		sb.append(s.charAt(s.length()-1)).append(s.substring(1, s.length()-1)).append(s.charAt(0));
		System.out.println(sb);
		
	}

}
