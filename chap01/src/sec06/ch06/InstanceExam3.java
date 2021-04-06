package sec06.ch06;

public class InstanceExam3 {
	
	public static void main(String[] args) {
		int mainNum = 10; // 주소값이 아니라 함부로 접근이 불가능함
		
		Box box = new Box(); // 주소값을 가지고 있으며 쉽게 접근이 가능함
		box.num = 10;
		
		changeNum(mainNum);
		System.out.println("mainNum : " + mainNum);
		
		changeBoxNum(box);
		System.out.println("box.num : " + box.num);
	}

	public static void changeNum(int num) {
		num = 20;
	}
	
	public static void changeBoxNum(Box box) { // 주소값을 가지기 때문에 서로 달라도 복사하여 새 설정이 가능함
		box = new Box(); // 새로운 객체화 했다면 이전 메모리는 사라짐, 다만 {}가 닫히는 순간 num = 20을 붙여도 소멸되기 때문에 10이 찍힘
		box.num = 20; // (만약 위에 객체화가 없었다면) main메소드에서 10을 설정했으나 해당 주소값이 20으로 바뀌었으니 복붙하여 설정된 것
	}
	
}

class Box {
	int num;
}
