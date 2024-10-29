package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {
	
	public static void main(String[] args) {
List<String> strings = Arrays.asList("apple","banana","cherry"); 
List<String> uppercaseStrings = strings.stream()
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());
System.out.println(uppercaseStrings);
	}
}
