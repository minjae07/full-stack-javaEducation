package kr.or.shi.staticvariable;

public class Card {
	
	//인스턴스 변수 --- 반드시 인스턴스를 생성해야 접근 가능
	private String color;								//카드의 색상
	private String company;								//카드 회사명
	
	//static 변수(=정적 병수, 클래스 병수, 공유 병수) --- 인스턴스 생성없이도 클래스명.static변수명으로 접근 가능
	static int width = 100;									//카드의 폭
	static int height = 50;									//카드의 높이
	
	//getter(), setter 인스턴스 메서드
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "card1의 색상 : " +
	
	/*
	 * 정적 변수(static)는 접근 방법이 클래스명, 정적변수명으로 접근 해야 올바른 방법
	 */
		       ", card1의 회사 : " +this.getCompany() +
		       ", 크기 : (" + Card.height + 
		       ", " + Card.width + 
		       ")";
		
	}

	
}


















