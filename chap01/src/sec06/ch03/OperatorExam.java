package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		//산술연산자
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 / n2); // =3, int 타입
		System.out.println(n1 / (float)n2); // 실수값을 표현할 수 있는 형변환, 한 곳만 해주면 됨
		float result = n1 / n2; //위와 같지 않고 3.0으로 출력
		System.out.println("result: " + result);
		System.out.println(n1 * n2);
		
		System.out.println("--------------------------------");
		
		int result2 = 3 + 4 + 5 * 6;
		//7 + 5 * 6
		// 12 * 6 --> 72가 나오지 않음. * 연산부터 시작
		System.out.println("result2: " + result2);
		
		int mod = 10 % 3; // 나머지 값을 구하는 것 '%' \ 10을 3으로 나눴을 때 생기는 1 = mod의 값이 됨
		System.out.println("mod: " + mod);
		// 홀수 짝수 구할 때 가장 많이 사용
		int odd = 3 % 2;
		int even = 4 % 2;
		System.out.println("odd: " + odd);
		System.out.println("even: " + even);
		
		System.out.println("--------------------------------");
		int n3 = 1; // 단항연산자 int n3 = -1 * 1
		System.out.println("n3: " + -n3);
	}	

}
