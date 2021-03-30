package sec06.ch04;

public class WhileMission3 {
	public static void main(String[] args) {
		int sum = 0;
		while(true) {
			int val = (int)(Math.random()*11);
			System.out.println("val : " + val);
			if(val == 0) {
				break;
			}
			sum = sum + val;
		}
		System.out.println("sum : " + sum);
	}

}
