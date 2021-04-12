package sec06.ch07;

public abstract class Animal {
	private int age;
	private String name;
	// 메소드에 선언부만 있는 것으로 추상 클래스를 만들 수 있음
	public abstract void howling(); 
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void breath() {
		System.out.println("숨쉰다");
	}
}
// 무조건 부모(추상)클래스의 메소드를 Override 해주어야 함
class Cat extends Animal {

	@Override
	public void howling() {
		System.out.println("야옹");
	}

}

class Dog extends Animal {

	@Override
	public void howling() {
		System.out.println("멍멍");
		
	}
	
}





