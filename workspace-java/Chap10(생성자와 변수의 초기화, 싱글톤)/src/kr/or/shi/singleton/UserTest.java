package kr.or.shi.singleton;

import java.util.Calendar;
import java.util.Date;

public class UserTest {
	
	public static void main(String[] args) {
	
		//User user1 = new Uesr();
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		System.out.println("user1의 주소 : " + user1);
		System.out.println("user2의 주소 : " + user2);
		
		if(user1.equals(user2)) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
		//객체의 == 연산자 : 주소값 비교 연산
		if(user1==user2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
		
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(date);
	}
	
}
