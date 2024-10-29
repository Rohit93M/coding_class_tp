package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStrings {
	
	public static void main(String[] args) {
List<String> strings = Arrays.asList("apple","banana","cherry","blueberry"); 
String longestString = strings.stream()
                                   .reduce((s1,s2)->s1.length()>s2.length()?s1:s2)
                                   .orElse("");
System.out.println(longestString);
	}
}
