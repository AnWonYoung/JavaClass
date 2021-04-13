package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam2 {
	public static void main(String[] args) {
		List<Card> list = new ArrayList(); 	// 카드 객체 주소값만 넣고 빼는 것이 가능
		Card c1 = new Card("", "");
		
		list.add(c1);
//		list.add("ddd");			불가능
		
		Card c2 = list.get(0);
	}

}
