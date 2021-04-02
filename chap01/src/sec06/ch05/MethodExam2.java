package sec06.ch05;

public class MethodExam2 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 30;

		voidSum(n1, n2);
		voidSum(1, 2); // voidSum 안에서 이미 Syso가 정의되고 있음
		 
		System.out.println("-----------");

		intSum(n1, n2);
		intSum(1, 2); // Syso가 정의되지 않아서 출력X

		// 100번 안녕하세요를 돌리는 식
		for (int i = 0; i < 100; i++) {
			hello();
		}

	}

	// void형, return값을 반환할 필요가 없을 때 사용하는 메소드
	public static void voidSum(int n1, int n2) {
		System.out.printf("%d + %d + = %d\n", n1, n2, (n1 + n2));
	}

	// void형, ()안의 파라미트 값이 없어도 실행이 가능함
	public static void hello() {
		System.out.println("안녕하세요.");
	}

	// 비void형, return값으로 반환하여 찍어낼 때 사용하는 메소드
	public static int intSum(int n1, int n2) {
		return n1 + n2;
	}

}
