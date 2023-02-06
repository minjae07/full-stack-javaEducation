package kr.or.shi.array03;

public class MainArgumentsTest {

	public static void main(String[] args) {
				//main()의 매개변수의 활용하는 방법
		
		if(args.length !=3) {
			System.out.println("프로그램 사용법");
			System.out.println("아이디 입력 패스워드 입력");
		}
		
		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];
		
		System.out.println("아이디 : " + str1);
		System.out.println("패스워드 : " + str2);
		System.out.println("a매개 : " + str3);
		
	}

}
