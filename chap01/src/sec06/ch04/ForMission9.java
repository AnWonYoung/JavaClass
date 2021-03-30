package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
		int star = 5;
		// ____*
		// ___**
		// __***
		// _****
		// *****

		// for문 3개 해결
		for (int i = 1; i <= star; i++) {
			for (int z = i; z < star; z++) {
				System.out.print("_");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------");

		// for문 2개 + if 해결
		for (int i = star; i > 0; i--) {
			for (int k = 1; k <= star; k++) {
				if (k < i) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
