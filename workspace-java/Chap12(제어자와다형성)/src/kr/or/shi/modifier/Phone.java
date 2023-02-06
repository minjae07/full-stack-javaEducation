package kr.or.shi.modifier;

public class Phone {
	
	//멤버변수
	//private String model;
	
	/*
	 * protected 접근 제어자 : 같은 패키지에서 다 접근 가능함(상속여부 상관 없음)
	 * 						상속받지 않은 클래스도 접근 가능함.
	 * 						다른 패키지에서 다 접근 불가(상속여부 상관 없음)
	 */
	protected String model;
	private String color;
	private String company;
	
	
	//매개변수가 있는 생성자
	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}

	//getter() 제공
	public String getModel() {
		return model;
	}


	public String getColor() {
		return color;
	}


	public String getCompany() {
		return company;
	}
	
	@Override
	public String toString() {
		
		return "모델 : " +this.getModel()+
				", 색상 : "+this.getColor()+
				", 제조회사 : "+this.getCompany();
				
	}
	
	
	
}









