package sec06.ch06;

public class OverloadingExam {
	public static void main(String[] args) {
		// Calc객체화
		// sum메소드를 호출 아규먼츠는 5,10

		Calc c1 = new Calc();
		c1.sum(5, 10);

		c1.sum(5, 10, 11);

		c1.sum(10, 20, "30");
	}

}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}

	void sum(int n1, int n2, String s1) {
		System.out.println(n1 + n2 + s1);
	}
}
