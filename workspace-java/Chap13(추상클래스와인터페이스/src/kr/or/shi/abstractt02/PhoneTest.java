package kr.or.shi.abstractt02;

public class PhoneTest {

	public static void main(String[] args) {
		
		//추상 클래스 자체는 인스턴스를 생성할 수 없다.
		//Phone phone = new Phone(1,"","");
		
//		Phone phone1 = new SmartPhone(201106, "이순신", "LG-V50");
//		phone1.
		
		SmartPhone smartPhone = new SmartPhone(201106, "LG-V50", "이순신");
		smartPhone.showInfo();
		smartPhone.turnOff();
		smartPhone.turnOn();
		smartPhone.internetSearch();
		System.out.println("-----------------------------------------");
		
		TripleCameraPhone tCameraPhone = new TripleCameraPhone(201112, "Apple iphone12", "류현진");
		tCameraPhone.showInfo();
		tCameraPhone.turnOff();
		tCameraPhone.turnOn();
		System.out.println("-----------------------------------");
		
		Phone[] phone = new Phone [10];
		phone[0] = new SmartPhone(201106, "Samsung", "박찬호");
		phone[1] = new TripleCameraPhone(202011, "LG", "손흥민");
		
		phone[0].turnOn();
		phone[0].showInfo();
		System.out.println("--------------------");
		
		phone[1].turnOn();
		phone[1].showInfo();
		
	}

}
