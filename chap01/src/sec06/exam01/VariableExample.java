package sec06.exam01;

public class VariableExample {
	public static void main(String[] args) {
		int a; // 변수 선언
//		System.out.println(a);  초기값을 주지 않은 변수 출력 불가능
		
		int value = 10; // 변수 초기화 
		int result = value + 10;
		System.out.println(result);
		
		byte byteValue = 10;
		float floatValue = 2.5f;
		double doubleValue = 2.5;
		
		byte result2 = (byte)(byteValue + byteValue);
	}
}