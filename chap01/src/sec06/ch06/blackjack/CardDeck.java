package sec06.ch06.blackjack;

public class CardDeck {
	private final Card[] CARD_ARR = new Card[52]; // Card 객체를 담을 수 있는 배열 (타입은 Card)
													// 배열 생성과 동시에 = 값을 주는 것 > 명시적 할당
	private String[] patternArr = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private String[] symbolArr = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public CardDeck() { // class에 앞에 public이 있다면 생성자도 꼭 붙여주기
		int deck = 0;
		for (int i = 0; i < patternArr.length; i++) {
			for (int z = 0; z < symbolArr.length; z++) {
				CARD_ARR[deck++] = new Card(patternArr[i], symbolArr[z]);
				System.out.println(CARD_ARR[deck - 1]);
			}
		}
	}

	public Card getOneCard() {
		int rIdx = (int) (Math.random() * CARD_ARR.length);
		Card c = CARD_ARR[rIdx];
		if (c == null) {			// 중복을 없애주는
			return getOneCard();
		} else {
			CARD_ARR[rIdx] = null; // 카드를 뽑고 없는 카드
			return c;
		}

	}
	
	public void printAll() {
		CardDeck cd = new CardDeck();
		for(int i=0; i<52; i++) {
			Card card1 = cd.getOneCard(); // 두 번 생성하면 53번이 되는 것 주의하기
			System.out.println(card1);
		}
	}
}
