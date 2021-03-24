package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 < num2);
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);
		System.out.println("result4= " + result4);
		
		System.out.println("-------------------------");
		
		char ch1 = 'A'; //65
		char ch2 = 'a'; //97
		boolean result5 = ch1 < ch2;
		System.out.println("result5= " + result5);
		System.out.println('a' == 97);
		System.out.println(0.1 == 0.1f); //근사치 값으로 계산, double, float은 비교가 불가능
		System.out.println(Double.compare(3.21, 3.222f));
		
		// < > <= >= == != 원시형 숫자타입(include char)에만 사용 가능
		
		String str1 = "A";
		String str2 = "A"; // true가 출력되지만 가능한 자제
		
		System.out.println("str1 == str2 : " + (str1==str2)); // XXX
		// 문자형 boolean 값 형식은 반드시 .equals
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
	}

}























