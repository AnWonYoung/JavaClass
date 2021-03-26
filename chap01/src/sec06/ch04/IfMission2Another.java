package sec06.ch04;
// 상수를 사용한 if문
// 성별이 찍히도록 만들기
public class IfMission2Another {
	public static void main(String[] args) {
		String gender = "여";
		int height = 162;
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;
		
		if(gender.equals("여")) {
			stand = WOMAN_STAND;
		}else if(gender.equals("남")) {
			System.out.print("남자: ");
		}System.out.print("여자: ");
		
		if(height < stand) {
			System.out.println("평균 미만");
		} else if(height == stand) {
			System.out.println("평균");
		} else {
			System.out.println("평균 초과");
		}
	}

}
