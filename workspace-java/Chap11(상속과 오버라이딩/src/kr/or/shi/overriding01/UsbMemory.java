package kr.or.shi.overriding01;

public class UsbMemory extends HddDisk {
	
	//멤버변수
	int capacity;
	int rpm;
	
	//기본생성자
	public UsbMemory() {
	
	}
	
	//매개변수가 있는 생성자
	public UsbMemory(int capacity, int rpm) {
		super();
		this.capacity = capacity;
		this.rpm = rpm;
	}

	@Override
	public String status() {
		
		String str = "USB 용량 : " +this.capacity+ "\n" + 
					"USB 속도 : " +this.rpm+"(rpm)" ; 
		return str;
	}
	
	//오버로딩
	public String status(int i) {
		
		String str = "USB 용량2 : " +this.capacity+ "\n" + 
					"USB 속도2 : " +this.rpm+"(rpm)" ; 
		return str;
	}
	
	
	
	
	
	
	
	
	
}
