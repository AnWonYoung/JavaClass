package sec06.ch06;

// 상속
public class InheriExam {
	public static void main(String[] args) {
		
		Cat cat = new Cat(); // 상속 받은 부모의 필드 및 메소드를 사용할 수 있음
		cat.name = "고양이";
		cat.age = 4;
		cat.cry();
		cat.lick(); // Cat이라는 자식 클래스만 사용할 수 있는 메소드임
		cat.cry(); // 오버라이드 메소드
	
	}
}
// super();의 의미 = this는 같은 클래스의 인스턴스만 포함하지만 super();을 통해서 부모의 인스턴스까지 초기화 가능

class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		super(); // 부모 클래스의 부모 = 'Object' = 최상위 클래스
		this.name=name;
		this.age = age;
	}
	
	void cry() {
		System.out.println("운다");
	}
}
 
class Cat extends Animal {
	public Cat() {
	 	super("name", 0); // 생성자 호출 / 부모를 뜻하지만 바로 위의 부모를 뜻함 / 반드시 super가 위에서 실행되어야 함
		System.out.println("Cat 생성자 : ");
	}
	
	void lick() {
		System.out.printf("%s가 핥다\n", name); // 자식만의 메소드를 추가 생성할 수 있음
	}
	
	@Override // 오버라이딩은 부모 메소드를 재정의 한다는 의미(따라서 부모에 cry가 있어야 함)
	void cry() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat { // 자식은 또 다른 자식 클래스를 받을 수 있음.
	void pee() {
		System.out.printf("%s가 소변을 본다.\n", name);
	}
}