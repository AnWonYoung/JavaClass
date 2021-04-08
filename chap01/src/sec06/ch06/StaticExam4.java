package sec06.ch06;

public class StaticExam4 {
	public static void main(String[] args) {
		// 메인 메소드 안에 다른 메인 메소드 부르기 가능
		StaticExam3.main(args); // 클래스 명 + static이 붙은 메인 메소드 / 3클래스가 먼저 실행 후 해당 4클래스가 실행되는 구조
		
		// CalcStaic2 객체화, 10과 20을 넣어 결과 값 출력
		ClacInstance2 c2 = new ClacInstance2();
		c2.num1 = 10;
		c2.num2 = 20;
		int result = c2.sum();
		System.out.println("ClacInstance2의 값 : " + result);
		String.format("%d", result);

		// private를 걸어뒀을 때
		ClacInstance3 c3 = new ClacInstance3();
		c3.setNum1(10);
		c3.setNum2(20); 
		int result2 = c3.sum();
		System.out.println("ClacInstance3의 값 : " + result2);
	}

}
// 대문자+. = static이라 생각하기 (ex, (Math.random)) 
class CalcStaic2 {
	static int sum(int num1, int num2) { // 멤버 필드의 static이 없을 때는 return해주는 sum에서도 static을 붙일 수 없음
		return num1 + num2;				 // 이유? static은 객체 없이도 빠르게 메모리에 올라가지만 비static=인스턴스의
	}									 // 경우에는 객체화 후 메모리게 올라갈 수 있으므로 서로 속도가 맞지 않음
}

class CalcStaic2_1 { // 필드에만 static이 있고 sum메소드에는 없을 때? > sum 사용이 목적이라면 비static이므로 객체 생성 후 사용
	static int num1;
	static int num2;
	
	int sum() {
		return num1+num2;
	}
}


class ClacInstance2 { // 비static은 반드시 객체화하여 사용할 수 있음, 현재는 의미가 없는 설계도
	int num1;
	int num2;
	int num3;

	int sum() {
		return num1 + num2;
	}

}

// 혼자 연습
class ClacInstance3 {
	private int num1;
	private int num2;

	int sum() {
		return num1 + num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

}