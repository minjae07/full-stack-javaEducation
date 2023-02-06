package kr.or.shi.polymorphism01;

//조상클래스
public class Player {
	
	private String name;
	private int age;
	private int backNumber;
	private int speed;
	
	//생성자
	public Player(String name, int age, int backNumber, int speed) {
		super();
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.speed = speed;
	}
	
	//getter() 메서드

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void info() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("등 번호 : " + this.getBackNumber());
		System.out.println("속도 : " + this.getSpeed());
		
		
		
	}
	
	
	

}
