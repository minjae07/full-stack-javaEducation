package kr.or.shi.polyparameter;

//독립클래스
public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	public void buy(TV tv) {
		//구매자가 가진 돈보다 제품의 가격이 비싼 경우
		if(this.money < tv.price) {
			System.out.println("잔액이 부족하여, 물건 구입이 안됩니다.");
			return;
		}
		
		this.money -= tv.price;
		this.bonusPoint += tv.bonusPoint;
		System.out.println(tv+ "를 구매하셨습니다.");
	}
	
	public void buy(Audio audio) {
		//구매자가 가진 돈보다 제품의 가격이 비싼 경우
		if(this.money < audio.price) {
			System.out.println("잔액이 부족하여, 물건 구입이 안됩니다.");
			return;
		}
		
		this.money -= audio.price;
		this.bonusPoint += audio.bonusPoint;
		System.out.println(audio+ "를 구매하셨습니다.");
	}
	
	public void buy(Computer computer) {
		//구매자가 가진 돈보다 제품의 가격이 비싼 경우
		if(this.money < computer.price) {
			System.out.println("잔액이 부족하여, 물건 구입이 안됩니다.");
			return;
		}
		
		this.money -= computer.price;
		this.bonusPoint += computer.bonusPoint;
		System.out.println(computer+ "를 구매하셨습니다.");
	}
	
	public void buy(Product product) {
		//구매자가 가진 돈보다 제품의 가격이 비싼 경우
		if(this.money < product.price) {
			System.out.println("잔액이 부족하여, 물건 구입이 안됩니다.");
			return;
		}
		
		this.money -= product.price;
		this.bonusPoint += product.bonusPoint;
		System.out.println(product+ "를 구매하셨습니다.");
	}

}
