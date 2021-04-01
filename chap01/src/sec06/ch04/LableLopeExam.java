package sec06.ch04;

// 중첩 for문
public class LableLopeExam {
	public static void main(String[] args) {
		OUTER: 
			for (int i = 0; i < 3; i++) {
				for (int z = 100; z < 105; z++) {
				System.out.printf("%d - %d \n ", i, z);

				if (z == 102) {
					break OUTER; // 자신을 감싸고 있는 1차 for문만 멈춤
				} // OUTER을 주면서 바깥 for문을 멈출 수 있음
			}
		}
		System.out.println("끝!");
	}

}
