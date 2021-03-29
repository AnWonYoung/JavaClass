package sec06.ch04;

public class ForMission2 {
	public static void main(String[] args) {
		// 1~3의 수를 더하시오
		
		int sum = 0;
//		
//		sum = sum + 1;
//		System.out.println("sum : " + sum);
//		
//		sum = sum + 2;
//		System.out.println("sum : " + sum);
//		
//		sum = sum + 3;
//		System.out.println("sum : " + sum);
		
		//1~20의 수의 합을 구하시오
		
		for(int i=1; i<=20; i++) {
			sum = sum + i;
		}
		System.out.println("sum : " + sum);

	}

}
