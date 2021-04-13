package sec06.ch07;

/*
 	추상 클래스									인터페이스
 	객체화 불가능								객체화 불가능
 	다중 상속 불가능								다중 상속 가능!
 	변수, 상수를 가질 수 있음						변수XX 상수만 가질 수 있음
 	구현부가 있는 메소드를 가질 수 있음				구현부가 있는 메소드를 가질 수 없음
 	(추상 메소드 가질 수 있음)						(추상 메소드만 가능함)
 	부모타입의 역할이 가능하며						부모타입의 역할이 가능하며
 	자식에게 추상 메소드 오버라이딩의 강제성 부여			자식에게 추상 메소드 오버라이딩의 강제성 부여				자식에게 추상 메소드 오버라이딩의 강제성 부여
 */

public interface RemoteControl {
// 인터페이스는 구현을 가질 수 없으며 선언부만 가질 수 있다.
	int AGE = 10; // 자동으로 public final static 전체가 자동으로 붙음 
				  // static이 붙기 때문에 RemoteControl.AGE로 다른 패키지에서 부를 수 있음
	
	void volumeUp();		// public abstract 자동으로 붙음
	void volumeDown();
	void chkVolume();		// 여기서 구현이 불가능함. 해당 메소드를 생성하라는 명령만 가능
}
