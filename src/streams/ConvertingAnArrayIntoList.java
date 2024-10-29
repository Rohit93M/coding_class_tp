package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Program to convert int array to list using streams
public class ConvertingAnArrayIntoList {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.stream(a)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);

		// why streams----> stream allows us to reduce the efforts and solve the program easily.
		// stream is continuous flow of data which returns a stream of data...
		// boxed() method will convert int array into Integer array...
		// collect method will convert the stream of data into list and help to collect all the 
		// data and store it..
		
	}
}
