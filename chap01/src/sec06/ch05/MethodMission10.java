package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNumArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };
		
		printMenu2(menuNumArr, menuPriceArr);
	}

	public static void printMenu(String[] a, int[] b) {
		System.out.println("     <메뉴>    ");
		for(int i=0; i<a.length; i++) {
		System.out.printf("%d. %s. (%d원)\n", i+1, a[i], b[i]);	
		}
	}
	
	public static void printMenu2(String[] a, int[] b) {
		String str = "메뉴\n";
		for(int i=0; i<a.length; i++) {
			str += String.format("%d. %s (%,d원)\n",i+1, a[i], b[i]);
		}
		System.out.println(str);
	}

}
