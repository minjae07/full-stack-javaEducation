package kr.or.shi.bankApp;

public class Account {
	
	private String ano;							//계좌번호
	private String owner;						//계좌주
	private int balance;						//잔액
	
	//매개변수가 있는 생성자
	public Account(String ano, String owner, int balance) {
		//super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}
	
	
	
}
