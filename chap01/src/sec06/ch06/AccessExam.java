package sec06.ch06;

public class AccessExam {
	
	public static void main(String[] args) {
		Access a = new Access();
//		a.num = 10; 값을 넣을 수 없음
		a.printNum();
	}

}

class Access {
	private int num; // 접근 제한자(지시어)
	
	void printNum() {
		System.out.println("num : " + num);
	}
}
