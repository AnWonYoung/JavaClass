package sec06.ch06;

public class StaticExam3 {
	public static void main(String[] args) {
		ClacInstance c1 = new ClacInstance(); // (비static)메모리에 올리기
		int result = c1.sum(10, 20);
		System.out.println("result : " + result);
		
		int result2 = CalcStaic.sum(10, 20); // static인 경우
		System.out.println("result2: " + result2);
	}

}
// 메소드에 static을 절대로 붙이면 안되는 메소드를 알아두고
// 웬만하면 static을 사용하는 것이 속도면에서 나을 수 있음
class CalcStaic {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class ClacInstance {
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}
