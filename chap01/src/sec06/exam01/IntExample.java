package sec06.exam01;
/*
 * 정수 모두 정리(4가지)
 */
public class IntExample {
	public static void main(String[] args) {
		char c = 'a'; // 거의 사용X 문자 하나만 저장할 수 있음
		
		byte b = 10;
		short s = 20;
		int i = 30; // 가장 많이 사용
		long l = 40;
		
		// 자동형변환
		
		s = b;
//		s = i;		자동형변환 불가능
		s = (short)i; // 수동으로 강제 변환
	}

}
