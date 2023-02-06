package kr.or.shi.oop03;

/*
 * 1) 매출에 더 많은 기여를 하는 고객이다.
 * 2) 제품을 살때 10% 할인을 해준다.
 * 3) 보너스 포인트는 제품 가격의 5%를 적립해 준다.
 * 4) 담당전문 상담원이 배정된다.
 * 5) Customer를 확장하여 구현한다.(상속)
 */
public class VIPCustomer extends Customer {
	
	private double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	
	
	
}
