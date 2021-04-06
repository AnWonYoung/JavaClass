package sec06.ch06; // 클래스의 Pull Name(package부터 public class까지)
// package명 규칙 = 웹 도메인 기준(naver.com이라면 com.naver.프로젝트명.+클래스명)
// 객체지향
public class InstanceExam { // 같은 이름이라도 패키지가 다르다면 이용 가능
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(); // 객체화 하는 방법
		Dog dog2 = new Dog();
//	Dog라는 래퍼런스 타입 + dog 변수명 = new라는 객체화 명령
// 	dog라는 변수가 직접 Dog 타입의 필드에 접근하여 호출부터 수정이 모두 가능함
		dog1.bark(); // 접근하여 실행하는 방법 변수명 + .
		dog1.name = "미미";
		dog1.bark();
		
		dog2.name = "삐삐";
		dog2.bark();
		new Dog(); // 가능하지만 일회성임. 생성하자마자 사라지며 접근이 불가능함
	}

}
// 여러 class를 생성 가능함, 객체가 될 수 있는 존재
// 객체란?
// 멤버 필드 (값을 저장할 수 있는 것) - 명사 담당
// 멤버 메소드 (값을 수정할 수 있는 것) -  동사 담당
// 설계도를 바탕으로 실체화 하는 것

// 하나의 class일 뿐이며 객체는 아님, 객체화 될 수 있는 '설계도'
class Dog { // 자바 명 클래스에서만 public class가 붙음
	String name;  /* 전역변수	*/
	int age;		 
	
	void bark() { // static public은 붙이지 않음
		System.out.printf("%s가 멍멍\n", name);
	}
} // 해당 class안에서만 전역변수가 유효함



















