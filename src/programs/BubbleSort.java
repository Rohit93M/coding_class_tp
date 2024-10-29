package programs;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {64,34,25,12,22,11,90};
		
		int n= arr.length;
		boolean swapped;
		
		// Outer loop: compare adjacent elements
		for(int i=0;i<n-1;i++) {
			swapped = false;
			
			for(int j=0; j<n-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					//Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1]=temp;
					
					swapped=true; // Mark that we made a swap
				}
				if(!swapped) { // If no elements were swapped during a pass, array is sorted
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
/*
 public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 9, 3, 7, 5, 1 };
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		

	}
}
 */
