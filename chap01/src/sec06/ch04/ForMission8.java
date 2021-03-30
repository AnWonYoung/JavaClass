package sec06.ch04;

public class ForMission8 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3;
		System.out.println("star의 값: " + star);

		for (int i = 0; i < star; i++) {
			for (int z = 0; z < star-i; z++) { //처리가 느림 쌤 깃 참고하기
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
/*적이요.,,에어컨 바람 직빵 자리시네요..,,분위기 알래스카*/
