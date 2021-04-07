package sec06.ch06;

public class ConstructorExam {
	// 객체지향 언어는 모두 생성자를 사용한다.
	// 생성자는 객체가 만들어질 때 무조건 호출 해야한다.
	public static void main(String[] args) {
		Tv tv1 = new Tv(); // 객체 후 세팅 설정 방법 두 가지
		tv1.brand = "Samsung"; // 1번
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 100;
		tv1.displayState();

		Tv tv2 = new Tv("Lg", 120, 300, 200); // 2번
		tv2.displayState();

		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.displayVolume();
		tv2.displayVolume();
	}

}

class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	// 기본 생성자 (메소드와의 차이점)
	// 생성자의 이름은 클래스 명과 같아야 함
	// 리턴 타입이 없음
	// 기본 생성자는 컴파일러가 생정자가 하나도 없을 시 넣어준다.
	// 객체를 생성할 때만 사용할 수 있음
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	Tv() {

	}

	void volumeUp() {
		int currentVolume = 0;
		this.currentVolume++; // 본인 주소값을 사용하고 싶을 때
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}

	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n", brand, inch, maxChannel, maxVolume);
	}
}
