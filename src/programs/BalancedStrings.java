package programs;

import java.util.ArrayList;

public class BalancedStrings {
	public static void main(String[] args) {
		String str = "}{][(){()[]}";
		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (al.size() > 0 && ((str.charAt(i) == '}' && al.get(al.size() - 1) == '{')
					|| (str.charAt(i) == ']' && al.get(al.size() - 1) == '[')
					|| (str.charAt(i) == ')' && al.get(al.size() - 1) == '('))){
				al.remove(al.size() - 1);

			} else
				al.add(str.charAt(i));
		}
		if (al.size() == 0) {
			System.out.println("String is balanced");
		} else {
			System.out.println("String is not balanced");
		}
	}
}
