package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random()*20)+81;
		System.out.println("SCORE : " + SCORE);
		//SCORE 값은 81~100점 사이의 값이 된다. (실행할때마다 달라짐)
		//91~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-")
		//81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-")
		
		char grade = 'A';
		char plma = '-';
		
		// 몫
		if(SCORE/10 >= 9) {
		}else if(SCORE/10 >= 8) {
			grade = 'B';
		}
		
		//나머지
		if(SCORE%10 >= 7 || SCORE%10 == 0) {
			plma = '+';
		}else if (SCORE%10 >= 4) {
			plma = ' ';
		}
		
		System.out.printf("%s" + "%s", grade, plma);
		
		
		
		
	}

}
