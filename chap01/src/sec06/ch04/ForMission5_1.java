package sec06.ch04;

public class ForMission5_1 {
	public static void main(String[] args) {
		// 2*1=2 3*1=3

		for (int i = 1; i < 10; i++) {
			for (int z = 2; z < 10; z++) {
				System.out.print(z + "*" + i + "=" + (i * z) + "\t");
			}System.out.println();
		}
	}

}
