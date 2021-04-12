package sec06.ch07;

public class polyMission {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
//		LocalBus lb = new LocalBus();
//		lb.openDoor();
		
		blowklaxon(car1);
		blowklaxon(car2);
		blowklaxon(car3);
		blowklaxon(car4);
	}
	public static void blowklaxon(Car c) {
		if(c instanceof Bus) {
			//Bus bus = (Bus)c;
			//bus.openDoor();
			((Bus)c).openDoor();
		}else {
			c.hoot();
		}
	}
	
}