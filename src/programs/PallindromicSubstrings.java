package programs;

import java.util.LinkedHashSet;

public class PallindromicSubstrings {

public static void main(String[] args) {
		
		String s = "radar";
		LinkedHashSet<String> set = new LinkedHashSet();
		
		for(int i=0;i<s.length();i++) {
			String subStr = "";
			for(int j=i;j<s.length();j++) {
				subStr=subStr+s.charAt(j);
				//System.out.println(subStr);
			//storing substring in set
				set.add(subStr);
			}
		}
		//System.out.println(set);
		for(String str : set) {
			isPalindrome(str);
		}
	}
	
	public static void isPalindrome(String str) {
	//reverse the string 
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev + str.charAt(i);
		}
		//System.out.println(rev);
		
	//checking string is palindrome
		if(rev.equals(str)) {
			System.out.println(str);
		}		
	}

}
