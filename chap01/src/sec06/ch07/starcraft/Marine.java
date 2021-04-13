package sec06.ch07.starcraft;

public class Marine implements Bionic {
	private int currentHP = 10;
	public final int MAX_HP = 20;
	
	public int getCurrentHP() {						// private를 접근할 수 있도록
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	
	
}
