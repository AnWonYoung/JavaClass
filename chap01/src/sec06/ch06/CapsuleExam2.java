package sec06.ch06;

public class CapsuleExam2 {
	public static void main(String[] args) {
		Human h1 = new Human(); // 이름: 미상 age : 18
		Human h2 = new Human("평강공주"); // 평강공주, 10
		Human h3 = new Human(30);// 미상, 30
		Human h4 = new Human("이순신, 20"); // 이순신, 20
		
		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();
	}

}
