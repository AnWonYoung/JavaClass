package sec06.ch06;

public class PolyExam2 {
	/*
	 * 1. 부모 타입은 자식객체 주소값을 참조할 수 있다.(가리킬 수 있다.) 
	 * 2. 자식 타입은 부모객체 주소값을 참조할 수 없다.
	 */
	public static void main(String[] args) {
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
//		Hamster ham = ani2;		불가능
		Hamster ham = (Hamster)ani2;
	}

}
