package kr.or.shi.array04;

import java.util.Scanner;

/*
 * 5명의 번호, 이름, 국어점수, 영어점수, 수학점수를 각각 배열에 
 * 입력해서 차례대로 출력하는 프로그램을 작성해보기.
 * 잘못된 값은 올바른 값이 입력될 때까지 다시 입력을 받아야 합니다.
 */
public class ArrayTest {
	
	static final int ID_MIN =1;
	static final int ID_MAX =10;
	static final int SCORE_MIN = 0;
	static final int SCORE_MAX = 100;
	static final int SUBJECT_SIZE = 3;
	static final int STUDENT_SIZE = 5;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//번호를 저장할 int형 배열
		int[] idArray = new int [STUDENT_SIZE];
		//이름을 저장할 String형 배열
		String[] nameArray = new String[STUDENT_SIZE];
		//국어점수,영어점수,수학점수를 저장할 int 배열
		int[] koreanArray = new int [STUDENT_SIZE];
		int[] englishArray = new int [STUDENT_SIZE];
		int[] mathArray = new int [STUDENT_SIZE];
		
		for(int i=0;i<STUDENT_SIZE;i++) {
			System.out.printf("--------------%d번째 학생의 정보 입력하기----------------\n", i+1);
			
			System.out.println("번호 :");
			idArray[i] = scan.nextInt();
			while(!(idArray[i] >= ID_MIN && idArray[i] <= ID_MAX)) {
				System.out.println("잘못 입력하였습니다.");
				System.out.print("번호 :");
				idArray[i] = scan.nextInt();
			}
			
			System.out.println("이름 :");
			scan.nextLine();
			nameArray[i] = scan.nextLine();
			
			System.out.println("국어 점수 :");
			koreanArray[i] = scan.nextInt();
			while(!(koreanArray[i] >= SCORE_MIN && koreanArray[i] <= SCORE_MAX)) {
				System.out.println("잘못 입력하였습니다.");
				System.out.print("국어 점수 :");
				idArray[i] = scan.nextInt();
			}
			
			System.out.println("영어 점수 :");
			englishArray[i] = scan.nextInt();
			while(!(englishArray[i] >= SCORE_MIN && englishArray[i] <= SCORE_MAX)) {
				System.out.println("잘못 입력하였습니다.");
				System.out.print("영어 점수 :");
				idArray[i] = scan.nextInt();
			}
			System.out.println("수학 점수 :");
			mathArray[i] = scan.nextInt();
			while(!(mathArray[i] >= SCORE_MIN && mathArray[i] <= SCORE_MAX)) {
				System.out.println("잘못 입력하였습니다.");
				System.out.print("수학 점수 :");
				idArray[i] = scan.nextInt();
			}
			
			System.out.println("---------------------------------------------");
			
		}
		
		
		System.out.println("");
		
		
		//입력값을 차례대로 출력해준다.
		for(int i=0; i<STUDENT_SIZE;i++) {
			System.out.printf("--------%d번째 학생의 정보--------\n", i+1);
			System.out.printf("번호 : %03d번 이름: %s \n", idArray[i], nameArray[i]);
			System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점 \n",koreanArray[i],englishArray[i],mathArray[i]);
			int sum = koreanArray[i] + englishArray[i] + mathArray[i];
			double average = sum / (double) SUBJECT_SIZE
					;
			System.out.printf("총점: %03d 평균: %6.2f점 \n",sum,average);
			System.out.println("----------------------------------");
			
			
		}
		
		scan.close();
		
		

	}

}
