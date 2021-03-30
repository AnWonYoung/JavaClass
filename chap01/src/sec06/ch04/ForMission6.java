package sec06.ch04;

public class ForMission6 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3;
		System.out.println("star의 값 : " + star);
		// 3~7사이 랜덤값

		// star = 3
		// ***
		// ***
		// ***

		for (int i = 0; i < star; i++) {
			for (int z = 0; z < star; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
