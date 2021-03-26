package sec06.ch03;

public class OperatorExam2 {
	public static void main(String[] args) {
		int n1 = 10;
		//증감연산자
		System.out.println("n1: " + n1);
		n1++; // 단순한 더하기 X
		System.out.println("n1: " + n1);
		++n1; // 결과는 똑같음 
		System.out.println("n1: "+ n1);
		--n1;
		System.out.println("n1: "+ n1);
		n1--;
		System.out.println("n1: "+ n1);
		
		System.out.println("--------------------------------");
		
		int n2 = 10;
		int result = 10 + (++n2); // ++부터 먼저 실행되면서 (11)의 값이 됨
		System.out.println("n2 result: " + result);
		System.out.println("n2: " + n2);
		
		
		int n3 = 10;
		int result2 = 10 + (n3++); // n3의 10이 먼저 10과 계산이 이루어진 다음 n3의 증감이 1 이루어짐
		System.out.println("n3 result2: " + result2);
		System.out.println("n3: " + n3);
		
		// 논리 부정 연산자(!)
		boolean result3 = 10 > 2;
		System.out.println("result: " + result3);
		System.out.println("result: " + !result3); //!로 boolean 값을 바꾸기
		
	}

}


























