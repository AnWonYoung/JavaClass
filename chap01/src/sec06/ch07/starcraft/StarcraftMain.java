package sec06.ch07.starcraft;

public class StarcraftMain {
	public static void main(String[] args) {
		Medic medic1 = new Medic();
		Medic medic2 = new Medic();
		Marine marine = new Marine();
		Tank tank = new Tank();
		
		medic1.heal(medic2);
		medic1.heal(marine);
		medic1.heal(tank);
		
	}

}
