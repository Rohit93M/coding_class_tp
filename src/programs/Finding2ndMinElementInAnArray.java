package programs;

public class Finding2ndMinElementInAnArray {
	
	public static void main(String[] args) {
		int[] arr = { 12, 1, 8, 81, 99, 66, 14 };
		
		int first = arr[0];
		int second = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i]<first) {
				second = first;
				first = arr[i];
			}
			
			if(arr[i]<second && arr[i]!=first) {
				second = arr[i];
			}
		}
		
	//	System.out.println(first);
		System.out.println(second);
	}
}
