package kr.or.shi.oop03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerLee2 = new VIPCustomer();
		customerLee2.setCustomerName("이도");
		customerLee2.setCustomerID(10020);
		customerLee2.bonusPoint = 10000;
		System.out.println(customerLee2.showCustomerInfo());

	}

}
