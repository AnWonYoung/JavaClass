package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {
	public static void main(String[] args) {
		int[] arr = { 88, 65, 23, 1, 900, 42, 95 };

		int temp = arr[1];
		arr[1] = arr[0];
		arr[0] = temp;

		System.out.println(Arrays.toString(arr));
	}

}

//		int temp = 0;
//
//		for (int i = 0; i < arr.length; temp += 2) {
//			temp = arr[i];
//			arr[i] = arr[i + 1];
//			arr[i + 1] = temp;
//		}