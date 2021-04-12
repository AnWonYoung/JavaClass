package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
//		PolymorMission pm = new PolymorMission(); 	static 메소드가 아니었을 때
		Hamster ham = (Hamster)hamster;
//		Hamster ham2 = (Hamster)pig; 			형변환 불가능
		ham.runRail();
		
		System.out.println(hamster instanceof Hamster);
//		System.out.println(pig instanceof Hamster);
		
		PolymorMission.cry(cat);
		PolymorMission.cry(pig);
		cry(hamster);
	}
// ani로 Hamster 객체 주소값이 들어오면
// howling 메소드가 아닌 runRail로 호출하기
	
	static void cry(Animal ani) { // cry 메소드를 생성 후 Animal이라는 부모 타입을 사용하기
		Hamster hamster = new Hamster();
		if(!(hamster instanceof Hamster)) {
			ani.howling();
		}else {
			hamster.runRail();
		}
	}

}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~꿀~");
	}

}

class Hamster extends Animal {
	public void runRail() {
		System.out.println("쳇바퀴를 굴리다.");
	}
	
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}