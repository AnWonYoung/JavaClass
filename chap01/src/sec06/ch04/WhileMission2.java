package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		int val = (int)(Math.random()*11);
		System.out.println("val : " + val);
		// 0이 아니면 계속 sum을 더하기 (0이 나올때까지 반복문을 돌리기)
		// sum : 지금가지 더한 값을 출력
		
		while(val != 0) {
			sum = sum + val;
			val = (int)(Math.random()*11);
			System.out.println("val : " + val);
		}
		System.out.println("sum : " + sum);	
	}

}
