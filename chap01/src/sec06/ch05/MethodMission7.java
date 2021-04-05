package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		do {
		System.out.print("성별 : ");
		String gender = scan.next(); // 남, 여만 가능
		
		System.out.print("키 : ");
		int height = scan.nextInt();
		
		String result = chk(gender, height);
		System.out.print(result);
		// 성별 : 남, 키: 170cm, 평균 미만
		// 성별 : 여, 키: 163cm, 평균
		System.out.println();
		System.out.print("계속 하시겠습니까? (y/n)");
		answer =  scan.next();
		}while(!answer.equals("n"));
		System.out.println("끝");
		scan.close();
	}
	
	public static String chk(String gender , int height) {
		int stand = 163;
		String result = "평균";
		switch(gender) {
		case "여":
			stand = 163;
			break;
		case "남":
			stand = 175;
			break;
		default:
			return "성별을 잘못 입력하셨습니다.";
		}
		
		if(height > stand) {
			result = "평균 초과";
		}else if(height < stand) {
			result = "평균 미만";
		}
		
		return String.format("성별: %s, 키: %dcm, %s", gender, height, result);
//		return "성별: " + gender + ", 키: " + height + "cm, " + result;
		
		
//		
//		final int MAN = 175;
//		final int WOMAN = 163;
//		int stand = MAN;
//		
//		if(gender.equals("여")) {
//			stand = WOMAN;
//		}
//		if(height < stand) {
//			return"평균 미만";
//		} else if(height == stand) {
//			return "평균";
//		}else {
//			return"평균 초과";
//		}
	}

}
