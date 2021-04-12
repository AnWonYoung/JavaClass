package sec06.ch07;

public class PolyExam {
	/*1. 부모타입은 자식 객체를 가리킬 수 있다. (참조, 저장)
	  2. 자식타입은 부모 객체를 가리킬 수 없다.
	  3. 변수타입은 메소드 호출 여부만 결정한다. (본인이 아는 것만 호출 가능)
	  	 호출이 되었다면 실행되는 기준은 객체다.
	 */
	public static void main(String[] args) {
		Car car1 = new Bus(); // 부모 -> 자식
		Car car2 = new Car(); // 스스로
		Car car3 = new LocalBus(); // 자식의 자식도 속하게 됨
		
//		Bus bus1 = new Car();  		불가능
//		Bus bus1 = (Bus)car2;		불가능
		Bus bus1 = (Bus)car1;
		bus1.openDoor();
		
		Car carp = bus1;
		carp.hoot();	   // 버스 객체를 찍었으니 Bus Bang이 찍힘
		car3.hoot(); 	   // LocalBus 객체를 가르키고 있음
		
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3 = truck1;
		carP3.hoot();
		
		System.out.println("-----------------------");
		
		Car carP4 = new LocalBus();
		Bus bus2 = new Bus();
		LocalBus lb = (LocalBus)bus2;		//bus2 = 부모 객체
		lb.hoot();
		
		System.out.println("끝!");
		
	}

}
