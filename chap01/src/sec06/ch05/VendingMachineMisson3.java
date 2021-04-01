package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMisson3 {
	public static void main(String[] args) {
		/*
		 * 돈을 주입해 주세요 : 3000 <메뉴> 0.종료 1.콜라(1000원) 2.사이다(1200원) 3.환타(1300원) 선택> 1 콜라를
		 * 선택하셨습니다.(남은 금액 2,000원) 금액이 부족합니다.(현재 금액 700원) 선택> 0 종료 - 남은 금액은 : 2000원
		 * 
		 */

		String[] menuNmArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 1200, 1300 };
		int money = 0;
		int num = 0;
		int change = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < menuNmArr.length; i++) {
			System.out.printf("%d. %s %,d원\n", i + 1, menuNmArr[i], menuPriceArr[i]);
		}
		
		System.out.println("돈을 주입해 주세요 : ");
		money = scan.nextInt();
		while (true) {
			System.out.println("선택> ");
			num = scan.nextInt();
			if (num < 0 || num > menuNmArr.length) {
				System.out.println("선택 오류\n");
				continue;
			} else if (num == 0) {
				System.out.println("종료");
				break;
			} else if (money < menuPriceArr[num - 1]) {
				System.out.printf("금액이 부족합니다. 남은 금액%,d원\n", money);
				continue;
			}
			money = money - menuPriceArr[num - 1];
			System.out.printf("%s를 선택하셨습니다. 남은 금액%,d원\n", menuNmArr[num - 1], money);
		}
		scan.close();
		System.out.printf("남은 금액 : %d", money);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		System.out.println("돈을 주입해 주세요 : ");
//		money = scan.nextInt();
//		while (true) {
//			System.out.println("선택> ");
//			num = scan.nextInt();
//			if (num < 0 || num > menuNmArr.length) {
//				System.out.println("선택 오류\n");
//				continue;
//			} else if (num == 0) {
//				System.out.println("종료");
//				break;
//			} else if (money < menuPriceArr[num - 1]) {
//				System.out.printf("금액이 부족합니다. 남은 금액%,d원\n", money);
//				continue;
//			}
//			money = money - menuPriceArr[num - 1];
//			System.out.printf("%s를 선택하셨습니다. 남은 금액%,d원\n", menuNmArr[num - 1], money);
//		}
//		System.out.printf("남은 금액 : %d", money);
	}
}
