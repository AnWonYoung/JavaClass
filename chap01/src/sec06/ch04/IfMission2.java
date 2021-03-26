package sec06.ch04;

public class IfMission2 {
	// 남자 평균 키 : 175
	// 여자 평균 키 : 163
	public static void main(String[] args) {
		String gender = "여"; // "여";
		int height = 162;
		// 남, 170 > 평균 미만
		// 남, 175 > 평균
		// 남, 176 > 평균 초과
		// 여, 162 > 평균 미만
		// 여, 163 > 평균
		// 여, 164 > 평균 초과
		
		if(gender.equals("남")) { 
			}else if(height < 175) {
				System.out.println("평균 미만");
			}else if(height == 175) {
				System.out.println("평균");
			}else {
				System.out.println("평균 초과");
			} 		
			
		if (gender.equals("여")) {
			if(height < 163) {
				System.out.println("평균 미만");
			}else if(height == 163) {
				System.out.println("평균");
			}else if(height <= 164) {
				System.out.println("평균 초과");
			}else {
				System.out.println("측정 불가");
			}
			}
		
		// 답
		// 먼저 잡아줘야 하는 것부터 조건 걸기
		if (gender.equals("남")) {
			if(height < 175) {
				System.out.println("평균 미만");
			}else if(height == 175) {
				System.out.println("평균");
			}else {
				System.out.println("평균 초과");
			}
		}else if(gender.equals("여")){
			if(height < 163) {
				System.out.println("평균 미만");
			}else if(height == 163) {
				System.out.println("평균");
			}else {
				System.out.println("평균 초과");
			}
		}else {
			System.out.println("측정할 수 없습니다.");
		}
		
		
		}
		
	}
