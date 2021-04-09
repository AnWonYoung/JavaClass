package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
//		PolymorMission pm = new PolymorMission(); 	static 메소드가 아니었을 때
			
		cry(cat);
		cry(pig);
		cry(hamster);
	}

	static void cry(Animal name) { // cry 메소드를 생성 후 Animal이라는 부모 타입을 사용하기
		name.howling(); // < 호출의 의미
	}

}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~꿀~");
	}

}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}