package sec06.ch06;

public class InstanceExam5 {
	public static void main(String[] args) {
		Car[] carArr = new Car[5];
		
		carArr[0] = new Car();
		
		carArr[0].name = "그렌저";
		
	}
	
	public static Car creatCar() { // creatCar주소 값을 리턴해주는 것
		return null; 
	}

}