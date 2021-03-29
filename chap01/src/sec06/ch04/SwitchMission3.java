package sec06.ch04;

public class SwitchMission3 {
	public static void main(String[] args) {
		int season = (int)(Math.random()*12)+1; // 랜덤한 값을 받아 1~12만 나오도록 처리
		System.out.println(season + "월");
		
//		3~5월 봄  / 6~8월 여름 / 9~11월 가을 12,1,2 겨울
		
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8: 
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:	// default 값도 가능(범위가 정해져 있어서)
			System.out.println("겨울");
			break;
		}

	}
	
}
