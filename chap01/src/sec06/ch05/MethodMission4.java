
package sec06.ch05;

public class MethodMission4 {
	public static void main(String[] args) {
		int rNum = getRandomNum(); // 0~9
//		System.out.println("rNum : " + rNum);

		rNum = getRandomNum(10);
//		System.out.println("rNum : " + rNum);

		rNum = getRandomNum(5, 10);
		System.out.println("rNum : " + rNum);
		rNum = getRandomNum(10, 20);
		System.out.println("rNum : " + rNum);
	}

	public static int getRandomNum(int min, int max) {
//		int[] arr = new int[max];
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static int getRandomNum(int max) {
		return (int) (Math.random() * max);
		// max라는 변수를 사용한 다이나믹한 메소드
	}

	public static int getRandomNum() {
		return (int) (Math.random() * 10);
	}

}
