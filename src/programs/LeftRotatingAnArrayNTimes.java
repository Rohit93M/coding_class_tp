package programs;

import java.util.Arrays;

public class LeftRotatingAnArrayNTimes {
public static void main(String[] args) {
		String str = "My name is Rohit";
		String[] strArray = str.split(" ");
		for (int i = 0; i < 4; i++) {
			String temp = strArray[0];
			for (int j = 0; j < strArray.length - 1; j++) {
				strArray[j] = strArray[j + 1];
			}
			strArray[strArray.length - 1] = temp;
		}
		System.out.println(Arrays.toString(strArray));
	}
}
