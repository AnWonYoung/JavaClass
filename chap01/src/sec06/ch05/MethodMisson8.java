package sec06.ch05;

public class MethodMisson8 {
	public static void main(String[] args) {
		gugudan(8);
		// 8 * 1 = 8
		// 8 * 9 = 72
		System.out.println("------------------------");

		gugudan(4, 8);
	}

	public static void gugudan(int i) {
		for (int z = 1; z < 10; z++) {
			System.out.printf("%d * %d = %d\n", i, z, i * z);
		}
	}

	public static void gugudan(int k, int i) {
		for (int j = k; j <= i; j++) {
			gugudan(j);
			System.out.println("------------------------");
		}
	}

}
