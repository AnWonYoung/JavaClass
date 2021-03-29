package sec06.ch04;

public class ForExam {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("i : " + i);
		}
		
		for(;;) { // 무한반복, 증감식이 없다면 계속 반복함
			System.out.println("안녕");
		}
	}

}
