package kr.or.shi.oop03;

/*
 * 1) 회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과 구매 우수고객(VIP)에 
 * 	  따른 서비스를 제공하고자 한다.
 * 2) 물품을 구매할 때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다르다.
 * 3) 이 두 개의 멤버쉽에 대한 각각 다양한 서비스를 제공할 수 있다.
 * 
 * 멤버쉽에 대한 구현을 클래스 상속을 활용하여 구현해보시오.
 */

/*
 * 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 비율
 * 		 일반고객의 경우 물품 구매시 1% 포인트 적립.
 */

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomerInfo() {
		return customerName+ " 님의 등급은 " + this.getCustomerGrade() + "이며, 보너스 포인트는 "
				+bonusPoint+ "입니다. ";
	}

}
