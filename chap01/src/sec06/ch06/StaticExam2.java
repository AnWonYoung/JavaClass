package sec06.ch06;

public class StaticExam2 {
	public static void main(String[] args) {
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		// static은 한 값이 바로 저장되어 객체 생성을 하지 않아도 아래의 출력이 나옴
		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount);
		
		System.out.println("Toy 2 : " + Toy2.makeCount);
		
		System.out.println("Toy 3 : " + Toy3.makeCount);
	}

}

class Toy2 {
	static int makeCount;
	
	Toy2() {
		makeCount++;
	}
}

class Toy3 {
	static int makeCount = 0;
}
