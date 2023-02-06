package kr.or.shi.multitype;

public class Car {
	
	private String brand;
	private int year;
	private int month;
	
	public Car() {
		
	}
	
	public Car(String brand, int year, int month) {
		super();
		this.brand = brand;
		this.year = year;
		this.month = month;
	}

	public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}
	

}
