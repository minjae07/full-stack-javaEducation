package kr.or.shi.decision02;

public class SwitchNestedTest {

	public static void main(String[] args) {
		int number = 9;
		
		switch(number) {
		case 1:
		case 7:
			switch(number) {
			case 1:
				System.out.println("011이시군요");
				break;
			case 7:
				System.out.println("017이시군요");
				break;
			}
		break;
		case 6:
		case 9:
//			switch(number) {
//			case 6:
//				System.out.println("016이시군요");
//				break;
//			case 9:
//				System.out.println("019이시군요");
//				break;
//			}
			
			if(number == 6) {
				System.out.println("016이시군요");
			}
			else if(number == 9) {
				System.out.println("019이시군요");
			}
		break;
		
		}

	}

}
