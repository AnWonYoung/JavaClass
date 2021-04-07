package sec06.ch05;

import java.util.Scanner;
// 메소드 + 객체지향
public class MethodMission10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] menuNumArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };
		
		
		Drink[] drinkArr = new Drink[6];
		
		for(int i=0; i<drinkArr.length; i++) {
			Drink d1 = new Drink();
			d1.nm = menuNumArr[i];
			d1.price = menuPriceArr[i];
				
			drinkArr[i] = d1;
			// Drink타입
		}
		
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = drinkArr[i]; // drinkArr[i]만 사용해도 됨
			System.out.printf("%d. %s (%,d원)\n", i+1, drink.nm, drink.price);
		}
		
		System.out.println("-----------printMenu2-----------");
		printMenu2(menuNumArr, menuPriceArr);
		System.out.println("-----------drinkArr-----------");
		printMenu3(drinkArr);

		
		boolean run = true; 
		while(run) {
			System.out.print("선택 > ");
			int selectedNum = scan.nextInt();
		}
		System.out.println("끝");
	}

//	public static void printMenu(String[] a, int[] b) {
//		System.out.println("     <메뉴>     ");
//		for(int i=0; i<a.length; i++) {
//		System.out.printf("-%d. %s. (%d원)\n", i+1, a[i], b[i]);	
//		}
//	}
	
	public static void printMenu2(String[] a, int[] b) {
		String str = "메뉴\n";
		str += "0. 종료\n";
		for(int i=0; i<a.length; i++) {
			str += String.format("%d. %s (%,d원)\n",i+1, a[i], b[i]);
		}
		System.out.println(str);
	}
	// Scanner는 타입 그대로
	// 
	
	
	public static void printMenu3(Drink[] drinkArr) {
		String str = "             메뉴            \n";
		str += "0. 종료\n";
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = drinkArr[i];
			str += String.format("%d. %s (%,d원)\n",i+1, drink.nm, drink.price);
		}
		System.out.println(str);
	}
}
