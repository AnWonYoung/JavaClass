package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		// 정수형 배열 생성 (10칸짜리)
		// 모든 방에 정수 값 20을 세팅
		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) { // 20을 넣는 for문
			intArr[i] = 20;
		}
		for (int i = 0; i < intArr.length; i++) { // 20값이 넣어졌는지 확인하는 for문
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}

}
