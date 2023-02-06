package kr.or.shi.carddeck;

public class DeckTest {
	
	public static void main(String[] args) {
		
		//Deck의 생성자를 호출하면 포함된 클래스(card)부터 생성을 먼저함.
		Deck deck = new Deck();
		Card card = deck.pick(0);
		System.out.print("카드 섞기 전에 제일 위에 있는 카드 => ");
		System.out.println(card.toString());
		
		card = deck.pick(51);
		System.out.print("카드 섞기 전에 제일 밑에 있는 카드 => ");
		System.out.println(card.toString());
		
		deck.shuffle();
		card = deck.pick(0);
		System.out.print("카드 섞은 후에 제일 위에 있는 카드 => ");
		System.out.println(card.toString());
		
		card = deck.pick(51);
		System.out.print("카드 섞은 후에 제일 밑에 있는 카드 => ");
		System.out.println(card.toString());
		
		
	}

}
