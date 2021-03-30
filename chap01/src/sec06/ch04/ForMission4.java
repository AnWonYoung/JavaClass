package sec06.ch04;

public class ForMission4 {
	public static void main(String[] args) {
		int dan = (int) (Math.random() * 8) + 2;
		int result = 0;
		// 2~9사이의 랜던값 설정

		// 2 * 1 = 2
		// 2 * 2 = 4

		for (int i = 6; i < 15; i++) {
			result = dan * (i-5);
			System.out.printf("%d * %d = %d\n", dan, (i-5), result);
		}
	}

}
