package sec06.ch04;

public class Exercise05 {
	public static void main(String[] args) {
		/*중첩 for문을 이용하여 방정식 4x + 5y = 60의
		 모든 해를 구해서 (x,y) 형태로 출력하라
		 단, x와 y는 10이하의 자연수입니다. 
		 */
		
		for(int i=1; i<=10; i++) {
			for(int z=1; z<=10; z++) {
				if((4*i) + (5*z) == 60) {
					System.out.printf("(%d, %d)\n", i, z);
				}
			}
		}
		
	}

}
