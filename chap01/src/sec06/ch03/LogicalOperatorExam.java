package sec06.ch03;

public class LogicalOperatorExam {
	public static void main(String[] args) {
		// &&(and), ||(or), !(not) 연산자
		
		boolean res1 = true && true && false; // 모두가 true가 나와야 함 따라서 false 값이 나오기 쉬움
		System.out.println("res1: " + res1);
		boolean res2 = true || false || false;
		System.out.println("res2: "+ res2);
		

	}

}
