package sec06.ch04;

public class Exercise04 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			int sum = num1 + num2;
			
			System.out.printf("주사위 값 : %d, %d \n", num1, num2);
			if(sum == 5) {
				break;
			} 
		}
		System.out.println("끝");
	}

}
