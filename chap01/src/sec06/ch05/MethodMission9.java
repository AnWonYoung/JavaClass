package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 10, 11, 45 };
//		System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);
	}

	public static String toString(int[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += (i < arr.length - 1 ? arr[i] + "," : arr[i]);
		}
		return String.format("[%s]", result);
	}

}
