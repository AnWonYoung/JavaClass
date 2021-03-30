package sec06.ch04;

public class ForMission3 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 6) + 5;
		System.out.println("star : " + star);
		// 5~10사이의 랜덤값 받기

		// 만약 star값이 5였다면 "*****"이 찍히도록
		// 만약 star값이 8이었다면 "********"이 찍히도록

		for (int i = 0; i < star; i++) {
			System.out.print("*");
		}
	}

}
