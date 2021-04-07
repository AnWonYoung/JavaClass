package sec06.ch06;

public class StaticExam {
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name);
		
		t2.name = "롯데";
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name); // 롯데가 호출
		System.out.println("Toy name : " + Toy.name);
										// 클래스. 으로 바로 값 출력 가능
		
		Toy.name = "SOC"; // static 타입
		System.out.println("Toy name : " + Toy.name);
		System.out.println("t2.name : " + t2.name);
	}
}

class Toy {
	static String name; // 객체와 전혀 상관 없음 즉, 메모리가 바로 저장된다는 것(객체화의 필요성이 X)
}
