package sec06.ch06;

public class StaticExam5 {
	public static void main(String[] args) {
		StaticExam5 st1 = new StaticExam5();
		st1.n1 = 10;
		st1.n2 = 20;
		int result = st1.sum();
		System.out.println("result : " + result);
	}

	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	}

}
