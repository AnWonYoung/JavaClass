package sec06.ch03;

public class Exercise05 {
	public static void main(String[] args) {
		//산술연산자만 사용
		int value = 356;
		System.out.println(value / 100 * 100);
		
		int result1 = value / 100;
		int result2 = value / 100;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		// 항상 백자리 수만 남도록 
		System.out.println(value - value % 100);
	}

}
