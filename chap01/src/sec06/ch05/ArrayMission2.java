package sec06.ch05;

public class ArrayMission2 {
	public static void main(String[] args) {
		// 정수형 10칸짜리, 1부터 10의 값이 순차적으로 대입
		// 각 방의 값을 콘솔에 출력
		// 입력과 출력의 for문을 분리하여 작성하기

		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}

		System.out.println("----------------------");

		// practice
		// 1~20까지의 수를 넣고, 그 합을 구하기
		int[] intArr2 = new int[20];
		int sum = 0;
		for (int i = 0; i < intArr2.length; i++) {
			intArr2[i] = i + 1;
		}
		for (int i = 0; i < intArr2.length; i++) {
			sum = sum + intArr2[i];
		}
		System.out.println("sum : " + sum);

	}

}
