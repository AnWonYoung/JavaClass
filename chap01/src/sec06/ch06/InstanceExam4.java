package sec06.ch06;

public class InstanceExam4 {
	public static void main(String[] args) {
		// Car 2개 객체화
		// 첫 번째 차 이름은 "소나타", cc는 2000
		// 두 번째 차 이름은 "911", ccs는 5000
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "소나타";
		c1.cc = 2000;
		c1.drive();
		c1.stop();
		
		c2.name = "911";
		c2.cc = 5000;
	}
}

class Car {
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다.\n", name);
	}
	
	void stop() {
		System.out.printf("%s는 멈춘다.", name);
	}
}
