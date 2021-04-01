package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 6 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int z = 0; z < arr.length - i - 1; z++) {
				if (arr[z] > arr[z + 1]) {
					int temp = arr[z + 1];
					arr[z + 1] = arr[z];
					arr[z] = temp;
				}
			}
		}
		System.out.println("-------------------");
		System.out.println(Arrays.toString(arr));
	}

}
