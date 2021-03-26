package sec06.ch03;

public class AssignmentOperatorExam {
	public static void main(String[] args) {
		//대입 연산자 
		int n1 = 0; // 최초값 설정
		n1 = n1 + 5;
		System.out.println("n1: " + n1);
		
		int n2 = 0;
		n2 += 5; // n1 = n1 + 5;와 같음
		System.out.println("n2: " + n2);
		
		int n3 = 10;
		// -복합식을 사용하여 4를 빼기
		n3 -= 4;
		System.out.println("n3: " + n3);
		
//		
//		System.out.println("n1: " + n1);
//		
//		int n2 = n1 + 10;
//		System.out.println("n2: " + n2);
//		System.out.println("n1: " + n1);
//		n1 = 2;
		
	}

}
