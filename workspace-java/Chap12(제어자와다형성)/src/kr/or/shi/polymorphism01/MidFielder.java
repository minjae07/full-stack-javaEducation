package kr.or.shi.polymorphism01;

public class MidFielder extends Player {
	
	//pass
	private int pass;
	
	public MidFielder(String name, int age, int backNumber, int speed, int pass) {
		super(name, age, backNumber, speed);
		this.pass = pass;
	}

	public int getPass() {
		return pass;
	}
	
	@Override
	public void info() {
		
		super.info();									//Player의 info()호출
		System.out.println("패스 횟수 : " + this.getPass());
	}

}
