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

class Human {
	private int age;
	private String name;
	// private는 생성자, 메소드를 통해서 사용할 수 있도록 설정 가능
	// 생성자는 값을 넣는, 메소드는 다시 빼내는 역할
	
	// setter, getter 
	// setter 타입은 반드시 void
	
	Human() {
		this(10);
	}
	
	Human(int age) {
		this("미상", age);
	}
	
	Human(String name) {
		this(name, 10);
	}
	
	Human(String name, int age) {
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








