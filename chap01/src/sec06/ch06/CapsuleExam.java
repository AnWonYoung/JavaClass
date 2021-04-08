package sec06.ch06;
// 캡슐화
public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		h1.setAge(12);
		h1.setName("홍길동");
		
		h2.setAge(20);
		h2.setName("신사임당");
		
		h1.whoAmI();
		h2.whoAmI();
		
		System.out.printf("My name is %s, age is %d\n", h1.getName(), h1.getAge());
		// 메소드를 사용해서 빼낼 수 있음
	}
}

enum number {
	// 상수들의 모임
}

class Human {
	private int age;
	private String name;
	// private는 생성자, 메소드를 통해서 사용할 수 있도록 설정 가능
	// 생성자는 값을 넣는, 메소드는 다시 빼내는 역할
	// 멤버 필드는 private를 걸어두는 게 좋음 (다만, 상수는 어차피 값이 안 바뀌니 패스)
	private final int AGE = 100; // 
	
	// setter(쓰기 메소드/ 생성자와 같이 옵션 사항임), getter(대부분 있음)
	// 생성자는 final 타입이 아니라도 값이 바뀌지 않음(즉, 멤버 필드에서 final이 없어도 변화할 수 없도록 만들 수 있음)
	// setter 타입은 반드시 void
	
	Human() {
		this(10); // this() > 생성자 호출
	}
	
	Human(int age) { // 위의 this 10 값이 들어옴
		this("미상", age);
	}
	
	Human(String name) {
		this(name, 10);
	}
	
	Human(String name, int age) { // 2번 생성자 값이 들어옴
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void whoAmI () {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", name, age);
	}
	
}








