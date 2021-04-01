package sec06.ch04;

public class SwitchExam {
	public static void main(String[] args) {
		int val = 2; // double 타입은 불가능
		switch(val) {
		case 1: // 들어온 값이 1인 경우
			System.out.println("값은 1이다.");
			break;
		case 2: // 맞는 수행문만 실행됨
			System.out.println("값은 2이다.");
			break; // 멈춰주지 않으면 밑의 수행문도 함께 출력함
		case 3:
			System.out.println("값은 3이다.");
			break;
		default: // default의 위치는 각각 break가 잡혀있을 땐 상관X
			System.out.println("값은 1~3이 아니다.");
			break;
		}
		System.out.println("끝");
	}

}
