package sec06.ch07;
// 추상 클래스
public class AbstExam {
	public static void main(String[] args) {
//		Animal animal = new Animal();  	추상 클래스는 객체화가 안됨
//		추상 클래스를 사용하는 이유? 부모 역할을 하겠다는 것 + 자식 클래스에게 강제성 부여
		
		Animal ani = new Cat();
		ani.breath(); // Animal 메소드
		ani.howling(); // Cat 메소드
		
	}

}
