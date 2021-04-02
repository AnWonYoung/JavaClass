package sec06.ch05;

public class MethodExam {
	public static void main(String[] args) {
				// void = 리턴 타입
		int result = sum(10, 20);
		System.out.println("result : " + result);
		result = minus(20,10);
		System.out.println("result : " + result);
	}
	// 메소드 안에 메소드 생성 불가능
	public static int sum (int n1, int n2) {
		return n1+n2;
	}
	
	public static int minus(int n1, int n2) {
		return n1-n2;
	}

}
