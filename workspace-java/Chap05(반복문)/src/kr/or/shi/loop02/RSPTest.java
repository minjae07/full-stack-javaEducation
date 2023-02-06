package kr.or.shi.loop02;

import java.util.Random;
import java.util.Scanner;

/*
 * 가위바위보 게임
 * 
 * 1. 플레이하기
 *    사용자로부터 가위바위보를 int로 입력받는다.
 *    가위:1
 *    바위:2
 *    보:3
 *    컴퓨터의 선택과 비교해서
 *      승리, 무승부, 패배를 기록해준다.
 * 
 * 2. 기록보기
 *    사용자의 현재 전적을 보여보기
 *    ###전 ###승 ###패 (승률 ##.##%)
 *      
 * 3. 종료
 * 
 * 단 무한루프를 사용해서 사용자가 원하는 만큼 플레이 할 수 있도록 만들어보자.
 */
public class RSPTest {

	static final int VALUE_SCISSOR = 1;
	static final int VALUE_ROCK = 2;
	static final int VALUE_PAPER = 3;
	static final int OPTION_MAX =3;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) {
			System.out.println("가위 바위 보 게임");
			System.out.println("1. 플레이 2. 기록보기 3. 종료");
			System.out.println(">");
			
		int userChoice = scan.nextInt();
		
		if(userChoice ==1 ) {
		
		//1. 컴퓨터가 가위바위보 중에서 하나를 선택하도록 한다.
			int computerNumber = random.nextInt(OPTION_MAX)+1;
			//2. 사용자가 가위바위보 중에서 하나를 선택하도록 한다.
			System.out.println("1. 가위 2. 바위 3. 보");
			int userNumber = scan.nextInt();
			
			while(!(userNumber >= VALUE_SCISSOR&& userNumber <= VALUE_PAPER)) {
				System.out.println("잘못입력했습니다.");
				System.out.println("1. 가위 2. 바위 3. 보");
				System.out.println(" > ");
				userNumber = scan.nextInt();
			}
			
			//3. 사용자의 선택과 컴퓨터의 선택을 각각 출력해준다.
			String userMessage = new String("사용자의 선택 : ");
			switch(userNumber) {
			case 1:
				userMessage += "가위";
				break;
			case 2:
				userMessage += "바위";
				break;
			case 3:
				userMessage += "보";
				break;
			}
			String computerMessage = new String("사용자의 선택 : ");
			switch(computerNumber) {
			case 1:
				computerMessage += "가위";
				break;
			case 2:
				computerMessage += "바위";
				break;
			case 3:
				computerMessage += "보";
				break;
		}
			
			System.out.println(userMessage);
			System.out.println(computerMessage);
		
			
			//4. 사용자값과 컴퓨터 값을 비교한다.
			// 승리, 패배, 무승부 셋중의 해당하는 값을 1 증가 시킨다.
			if(computerNumber == userNumber) {
				//무승부
				System.out.println("무승부!");
				draw++;
			}
			else {
				//승리 혹은 패배
				if(userNumber == VALUE_SCISSOR) {                    //사용자가 가위를 골랐을 경우
					if(computerNumber == VALUE_ROCK) {               //컴퓨터가 바위를 골랐을 경우
						System.out.println("패배!!");
						lose++;
					}
					else {
						System.out.println("승리!!");                 //컴퓨터가 보를 골랐을 경우
						win++;
					}
				}
				else if (userNumber == VALUE_ROCK) {                 //사용자가 바위를 골랐을 경우
					if(computerNumber == VALUE_SCISSOR) {            //컴퓨터가 가위를 골랐을 경우
						System.out.println("승리!!");                 
						win++;
					}
					else {                                           //컴퓨터가 보를 골랐을 경우
					System.out.println("패배!!");
					lose++;
					}
				}
				else if (userNumber == VALUE_PAPER) {                //사용자가 보를 골랐을 경우
					if(computerNumber == VALUE_ROCK) {               //컴퓨터가 바위를 골랐을 경우
					   System.out.println("승!!");
					   win++;
					}
					else {                                           //컴퓨터가 가위를 골랐을 경우
						System.out.println("패배!!");
						lose++;
					}
				}
			}
			
		}	
		else if(userChoice == 2) {
			/*
			 * 현재 결과를 출력한다.
			 * 총전적(승,무,패의 합)이 0 이면 "아직 플레이 기록이 없습니다."를 출력해준다.
			 */
			int total = win + lose + draw;
			if(total == 0) {
				System.out.println("아직 플레이한 기록이 없습니다.");
			}
			else {                                                //플레이 기록이 있으므로 출력한다.
				System.out.printf("%03d전 %03d승 %03d패 (승률 %5.2f%%)\n", total, win, lose, (double)win/total * 100);
				System.out.println();
			}
		}
		else if(userChoice == 3) {
			System.out.println("사용해주셔서 감사합니다.");
			break;
		}
	}
		scan.close();
		
	}
}
