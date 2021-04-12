package sec06.ch07;

public class PolyExam2 {
	
	public static void main(String[] args) {
		
//		Bus bus = new Truck();  	불가능(상속 관계만 가능하며 형제는 적용이 안됨) instanceof로 비교하는 것도 불가능함
		
		Car car1 = new LocalBus();
		System.out.println(car1 instanceof LocalBus); //true
		
		System.out.println(car1 instanceof Bus);
		Bus bus1 = (Bus)car1;
		
		System.out.println(car1 instanceof Object); // 최상위 계층이라 무조건 어디든 true
		
		Car car2 = new Bus();
		System.out.println(car2 instanceof LocalBus); // false 자식 타입으로 형변환 불가능
	
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus); 	// 상속 관계X 형제 관계
	}

}
