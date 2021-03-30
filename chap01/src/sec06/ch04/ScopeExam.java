package sec06.ch04;

public class ScopeExam {
	public static void main(String[] args) {
		//스코프 (변수, 상수가 살아있는 범위
		
		int a = 10;
		if(a > 9) {
			System.out.println("a : " + a);
			int jjj = 10;
		}
//		System.out.println("jjj : " + jjj);
//		if문 안에서만 선언한 변수는 사용 불가
	}

}
