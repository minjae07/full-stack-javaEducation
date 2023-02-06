package kr.or.shi.decision02;

public class switchTest {

	public static void main(String[] args) {

		int score = 10;
		
		//조건 : int 이하의 정수값, String값이 들어옴. 조건을 잘 줘야함.
		switch(score){ 
		case 95 : 
			System.out.println("95점 입니다.");
			break;
		case 94 : 
			System.out.println("94점 입니다.");
			break;
		case 92 : 
			System.out.println("92점 입니다.");
			break;
			default:
				System.out.println("잘못된 값입니다.");
		}

	}

}
