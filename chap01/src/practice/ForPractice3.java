package practice;

public class ForPractice3 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
			System.out.println("------------------");
		}
		// 3~5까지의 랜덤한 star의 수
		int star = (int)(Math.random()*3)+3;
		
		for(int i=star; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
