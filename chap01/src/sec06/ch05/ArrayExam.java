package sec06.ch05;

// 배열
public class ArrayExam {
	public static void main(String[] args) {
		// 여러 개 같은 변수 타입을 편하게 사용하기 위해 설정

//		int n1, n2, n3, n4;
		int[] intArr = new int[10]; // 10개의 저장 배열을 설정, double 타입 가능
		intArr[0] = 11; // 첫 번째에 값을 넣는 것
		intArr[9] = 5;

		// 변수의 분류 : 원시형, 참조형
		String[] strArr = new String[10];
		System.out.println("strArr[1] : " + strArr[1]);
		System.out.println("----------------------------");
		int[] intArr2 = { 10, 20, 30 };
		
		for(int i=0; i<3; i++) {
			System.out.printf("intArr2[%d] : %d\n", i, intArr2[i]);
		}

	}

}
