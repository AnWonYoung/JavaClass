package sec06.ch05;

public class MethodMission5 {
	// 중복된 소스 최대한 제거
	// 메소드 재활용 극대화 시키기
	public static void main(String[] args) {
		int star = 5;

//		printStarLine(star); // *****
//		
//		System.out.println();
//		
//		star = 3;
//		printStarLine(star);

//		PrintStarSqure(star);
//
//		star = 3;
//		PrintStarSqure(star);

//		삼각형 별찍기
//		PrintStarTri(star);
		
//		역삼각형 별찍기
		PrintStarTri2(star);

	}

	public static void printStarLine(int star) {
		for (int i = 0; i < star; i++) {
			System.out.print("*");
		}
	}

	public static void PrintStarSqure(int star) {
		for (int i = 0; i < star; i++) {
			printStarLine(star);
			System.out.println();
		}
	}
// 삼각형 찍기
	public static void PrintStarTri(int star) {
		for (int i = 1; i <= star; i++) {
			printStarLine(i);
			System.out.println();
		}
	}
	
	public static void PrintStarTri2(int star) {
		for(int i= star; i>0; i--) {
			printStarLine(star--);
			System.out.println();
		}
	}
}
