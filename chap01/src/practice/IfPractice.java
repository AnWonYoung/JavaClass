package practice;

import java.util.Scanner;
// if문으로 등급 구하기 
public class IfPractice {
	public static void main(String[] args) {
		char grade = '0'; 
		int score;
		System.out.println("점수를 입력하세요 :  ");
		Scanner sc= new Scanner(System.in);
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80 && score < 90 ) {
			grade = 'B';
		} else if(score >= 70 && score < 80) {
			grade = 'C';
		} else if(score >= 60 && score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("학점은" + grade + "입니다.");
		
	}

}
