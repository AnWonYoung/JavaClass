package sec06.ch04;

public class ForMission {
	public static void main(String[] args) {
		// 20~50의 수가 찍히도록

		for (int i = 20; i < 51; i++) {
			System.out.println("i : " + i);
		}

		for (int i = 0; i < 31; i++) { // 같은 결과가 나타남 for는 단순히 몇 번을 반복할지에 대한 설정
			System.out.println(i + 20);
		}

		// 24 ~ 32
		
		for (int j = 52; j <= 60; j++) {
				System.out.println("j : " + (j-28));
			}
		
//		for (int j = 24; j <= 60; j++) {
//			if (j <= 32) {
//				System.out.println("j : " + j);
//			}
//		}
	}

} 
