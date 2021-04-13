package sec06.ch07;

public class LGTv implements RemoteControl{ // implements(인터페이스 상속의 의미)
	private int volume;
	
	public void welcome() {
		System.out.println("LG Welcome!!");
	}
	
	@Override
	public void volumeUp() {
		volume++;
	}

	@Override
	public void volumeDown() {
		volume--;
	}

	@Override
	public void chkVolume() {
		System.out.println("volume : " + volume);
	}

}
