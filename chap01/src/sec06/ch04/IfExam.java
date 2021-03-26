package sec06.ch04;

public class IfExam {
	public static void main(String[] args) {
		int score = 93;
		// If문
		if(score >= 90) {
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급 A");
		}
		
		if(score < 90) {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급 B");
		}
		
		System.out.println("끝");
		System.out.println("-------------------------");
		
		// else If문 
		if(score >= 90) {
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급 A");
		} else if(score < 90) {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급 B");
		}
		System.out.println("끝2");
		
	}

}
