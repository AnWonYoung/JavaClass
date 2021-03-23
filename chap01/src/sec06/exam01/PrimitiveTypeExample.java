package sec06.exam01;
// 원시타입 vs 참조타입 (Reference Type)
public class PrimitiveTypeExample {
	public static void main(String[] args) {
		// 총 8개
		// byte < short < int < long, 
		// < float < double
		
		byte var1 = 0; // 최대값 127까지만 가능
		short var2 = 127; //128의 값을 넣으면 되돌아가서 -128의 값이 나옴
		var1=(byte)var2; // 강제 형변환 
		System.out.println("var1 : " + var1);
		
		float var3 = 10.123f;
		int var4 = (int)var3; // 강제 형변환 시 실수는 사라짐
		System.out.println("var4 : " + var4);
		
		// char(문자형)
		// boolean
		// 원시타입은 리터럴 값을 저장한다.
		
	}

}
