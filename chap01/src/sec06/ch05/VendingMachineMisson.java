package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMisson {
	public static void main(String[] args) {
		/* 아래는 콘솔에 출력해야 하는 내용입니다.
		 * <메뉴>
		 * 1. 콜라 (1000원)
		 * 2. 사이다 (1200원)
		 * 3. 환타 (1300원)
		 */
		int menu = 0;
		int num = 0;
		int total = 0;
		String[] menuNmArr = {"콜라", "사이다", "환타"};
		int[] menuPriceArr = {1000, 1200, 1300};
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<menuNmArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuNmArr[i], menuPriceArr[i] );
		}
		
		while(true) {
			System.out.print("메뉴를 입력하세요(0 입력 시 종료): ");
			num = scan.nextInt();
			
			if(num < 0 || num > menuNmArr.length) {
				System.out.println("선택 오류");
				continue;
			} else if(num == 0) {
				break;
			}
			
			System.out.printf("%s %d원\n", menuNmArr[num-1], menuPriceArr[num-1]);
			total += menuPriceArr[num-1];
		}
		System.out.printf("합계: %d원\n", total);
		scan.close();
	}

}
