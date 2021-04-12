package practice;

import java.util.Scanner;

public class IfPractice2 {
	public static void main(String[] args) {
		// 남성 평균 키 : 175 여성 평균 키 : 165
		// 평균 이하 및 이상 및 평균
		String gender;
		Scanner scan = new Scanner(System.in);
		String result;
		final int MANH = 175;
		final int WANH = 165;
		int height;
		
		System.out.println("성별을 입력하세요.");
		gender = scan.next();
		System.out.println("키를 입력하세요.");
		height = scan.nextInt();
		
//		if(gender.equals("남")) {
//			if(height == MANH) {
//				result = "평균";
//			}else if(height > MANH) {
//				result = "평균 이상";
//			}else {
//				result = "평균 이하";
//			}
//		}
		
		if(height == WANH) {
			result = "평균";
		}else if(height > WANH) {
			result = "평균 이상";
		}else {
			result = "평균 이하";
		}
		
		System.out.printf("%s, %d : %s", gender, height, result);
	}

}
