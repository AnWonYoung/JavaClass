package sec06.ch06.blackjack;

public class CardMain {
	
	public static void main(String[] args) {
		Card c1 = new Card("spade", "K");
		System.out.println(c1.toString()); //toString이 생략되어 있는 것
//		println(c1);
		CardDeck cd = new CardDeck();
		
		Card c2 = new Card("heart", "2");
		System.out.println(c2);
//		println(c2);
		
		Card c3 = new Card("club", "J");
		System.out.println(c3.toString());
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) {
		System.out.println("obj!");
		println(obj.toString());
	}

}