package sec06.ch05;

public class MethodMission6 {
	public static void main(String[] args) {
		int score = getRandomScore(50, 100);
		// 50~100 사이의 랜덤 숫자가 나오도록 설정
		char grade = getGrade(score);
		// 90점 이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 나머지 E
		char grade2 = getGrade2(score);
		// ?8 이상이거나 100점이면 '+'
		// ?3 이하이면 '-'
		// 나머지 ' ' 빈칸이 리턴 되도록

		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}

	public static int getRandomScore(int a, int b) {
		return (int) (Math.random() * (b-a+1)) + a;
	}

	public static char getGrade(int score) {
		char grade = 'E';
		if(score/10 >= 9) {
			grade = 'A';
		}else if(score/10 >= 8) {
			grade = 'B';
		}else if(score/10 >= 7) {
			grade = 'C';
		}else if(score/10 >= 6) {
			grade = 'D';
		}
		return grade;
	}
	
	public static char getGrade2(int score) {
		char grade2 = ' ';
		if(score%10 >= 8 || score == 100) {
			grade2 = '+';
		}else if (score%10 <= 3) {
			grade2 = '-';
		}
		return grade2;
	}
}
