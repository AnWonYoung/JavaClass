package sec06.ch06;

public class ConstructorExam2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
	}
	
	
}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	// this.은 멤버 필드 읽기 쓰기, 생성자와 메소드를 정의할 수 있음
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	Tv2() { // 세팅 설정 3번, this()는 생성자 호출
		this("일렉트로", 50, 100, 50);
	}

	void volumeUp() {
		int currentVolume = 0;
		this.currentVolume++; 
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}

	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n", brand, inch, maxChannel, maxVolume);
	}
}