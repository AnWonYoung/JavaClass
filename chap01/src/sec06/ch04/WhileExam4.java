package sec06.ch04;

public class WhileExam4 {
	public static void main(String[] args) {
		// 선실행 후조건
		int val = 0, sum = 0;
		do {
			val = (int)(Math.random()*11);
			sum = sum + val;
		}while(val != 0);
		System.out.println("dowhile-sum : " + sum);
	}

}
