package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMisson2 {
	public static void main(String[] args) {
		/*<메뉴>
		 * 0.종료
		 * 1.콜라(1000원)
		 * 2.사이다(1200원)
		 * 3.환타(1300원)
		 * 선택> 1
		 * 콜라를 선택하셨습니다.
		 * 
		 * 선택> 0
		 * 종료 - 사용한 금액은 : 2000원
		 * 
		 */
		
		String[] menuNmArr = {"콜라", "사이다", "환타"};
		int[] menuPriceArr = {1000, 1200, 1300};
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int total = 0;
		
		for(int i=0; i<menuNmArr.length; i++) {
			System.out.printf("%d. %s %,d원\n", i+1, menuNmArr[i], menuPriceArr[i]);
		}
		
		while(true) {
			System.out.println("선택> ");
			num = scan.nextInt();
			
			if(num < 0 || num > menuNmArr.length) {
				System.out.printf("선택 오류\n");
				continue;
			}else if(num == 0) {
				System.out.println("종료");
				break;
			}
			//중복되는 num-1을 변수로 지정하고 사용하는 게 좋음
			System.out.printf("%s를 선택하셨습니다. %,d원\n", menuNmArr[num-1],menuPriceArr[num-1]);
			total += menuPriceArr[num-1];
		}
		System.out.printf("합계 : %,d", total);
	}

}
