package streams;

import java.util.Arrays;
import java.util.List;

public class CountNames {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Mike", "Aaron");
		long count = names.stream()
		.filter((name)->name.startsWith("A")).count();
		System.out.println(count);
	}
}
