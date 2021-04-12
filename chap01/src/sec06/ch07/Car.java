package sec06.ch07;

public class Car {
	public void hoot() {
		System.out.println("빵! 빵!");
	}
}

class Bus extends Car {
	public void openDoor() {
		System.out.println("승객문을 열다.");
	}
	
	public void hoot() {
		System.out.println("Bus Bang! Bang!");
	}
}

class LocalBus extends Bus {
	public void hoot() {
		System.out.println("LocalBus Bang! Bang!");
	}
}

class Truck extends Car {
	public void hoot() {
		System.out.println("Truck Bang! Bang!");
	}

}