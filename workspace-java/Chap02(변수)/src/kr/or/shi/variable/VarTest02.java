package kr.or.shi.variable;

public class VarTest02 {

	public static void main(String[] args) {
	
		 int number;               //4바이트 만큼 변수를 메모리(Stack)를 할당함. 변수선언
		 number = 200;             //초기화
         System.out.println(number);
         
         int number2 = 500;        //선언과 동시에 초기화
         System.out.println(number2);
         
         String str =new String("경산시");
         System.out.println(str);
         
         str = null;               //null은 '없다'의미
         System.out.println(str);
         
         double dnum = 10.01;
         System.out.println("실수 : " + dnum);
         
         final int Max_NUMBER = 100;
         System.out.println("상수 : " + Max_NUMBER);
	}

}
