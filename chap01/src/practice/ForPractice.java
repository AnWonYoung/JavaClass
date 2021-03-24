package practice;

import java.util.Scanner;
public class ForPractice {
	public static void main(String[] args) {
		// 구구단 2단만 찍기
		int a = 0;
		for(int i=1; i<10; i++) {
			a = 2;
			System.out.printf("%d * %d = %d\n", a, i, a*i);
		}
		
		// 단을 입력 받아서 구구단 찍기
		System.out.println("숫자를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt(); // num 받아주기
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*1);
		}
		
		// 이중 for문 돌려주기 단을 입력 받은 다음 2~9까지의 구구단 찍기
		System.out.println("단을 입력하세요: ");
		int dan = new Scanner(System.in).nextInt();
		for(int i=2; i<=dan; i++) {
			System.out.printf("%d단: \n", i);
			
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
		
	}

}
