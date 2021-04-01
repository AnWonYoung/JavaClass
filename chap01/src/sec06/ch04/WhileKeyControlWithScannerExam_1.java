package sec06.ch04;

import java.util.Scanner;

public class WhileKeyControlWithScannerExam_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speed = 0;
		System.out.println("***************");
		System.out.println("1.증속 | 2.감속 | 3.중지");
		System.out.println("***************");
		while(true) {
			System.out.print("번호 입력 : ");
			int val = scan.nextInt();
			
			if(val == 1) {
				speed++;
			} else if(val == 2 ) {
				speed--;
			} else if (val == 3 ) {
				break;
			} else {
				System.out.println("1~3번만 입력하세요.");
				continue;
			}
			System.out.println("현재 속도 : " + speed);
		}
		System.out.println("마지막 속도 : " + (speed * 0));
		scan.close();
	}

}
