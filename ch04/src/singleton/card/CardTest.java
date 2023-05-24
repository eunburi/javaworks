package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		//카드공장 객체 생성
		CardCompany company = CardCompany.getInstance();
		
		Card trump = company.createCard();
		Card joker = company.createCard();
		Card Queen = company.createCard();
		
		//카드이름생성
		System.out.println(trump.getCardNum());
		System.out.println(joker.getCardNum());
		System.out.println(Queen.getCardNum());

	}

}
