package sec06.ch04;

public class SwitchMission {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;// 8 ~ 11까지의 수 
		System.out.println("time : " + time);
		
		// time = 8일 때 "출근합니다"
		// time = 9일 때 "회의를 합니다."
		// time = 10이면 "업무를 봅니다."
		// 나머지 시간이면 "외근을 나갑니다."
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
	
	
	}

}
