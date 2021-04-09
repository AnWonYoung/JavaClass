package sec06.ch06;

public class PolymorExam {
	public static void main(String[] args) {
		Animal ani_1 = new Cat(); // 부모는 자식 객체를 가리킬 수 있음
		Animal ani_2 = ani_1;
		Cat cat = (Cat)ani_1; // Cat객체에 담긴 주소값을 다시 cat에 담을 수 있음
		  // 강제 형변환이 필요함
		
//		Cat cat1 = new Animal(); 자식은 부모의 객체를 가리킬 수 없음
//		Cat cat1 = (Cat)new Animal(); 형변환으로 묶어도 에러 생김
		
		
//		어느 타입으로 객체를 사용하느냐에 따라서 사용할 수 있는 메소드가 다름
		ani_1.howling();
//		ani_1.lick();  Cat객체임에도 Animal타입이라 사용이 불가능함
		cat.lick();    // ani_i의 주소값을 받았으나 Cat타입으로 해당 메소드 사용 가능
		
		
		System.out.println("끝");
	}

}
