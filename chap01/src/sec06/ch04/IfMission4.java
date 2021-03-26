package sec06.ch04;

public class IfMission4 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random()*41)+60;
		System.out.println("SCORE : " + SCORE);
		
		
		String dGrade = "D";
		char dGradeChar = ' ';
		
		int restVal = SCORE % 10;
		if(restVal >= 7 || restVal == 0) { dGradeChar = '+';}
		else if(restVal <= 3 ) { dGradeChar = '-';}
		
		if(SCORE > 90) {dGrade = "A";}
		else if (SCORE > 80) {dGrade = "B";}
		else if(SCORE > 70) {dGrade = "C";}
		else { dGradeChar = ' '; }
		
		System.out.printf("%s%c", dGrade, dGradeChar);
		
	}

}
