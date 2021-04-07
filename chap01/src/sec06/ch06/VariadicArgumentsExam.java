package sec06.ch06;

public class VariadicArgumentsExam {
	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		cal.sum(10,20);
		cal.sum(10,20,30);
		cal.sum(10,20,30,40);
	}

}

class Calc2 {
	void sum(int...vals) { // 갯수 제한 X 여러 개 보내면 배열이 됨 int[] vals는 불가능
		int sum = 0;
		for(int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		System.out.println(sum);
	}
}
