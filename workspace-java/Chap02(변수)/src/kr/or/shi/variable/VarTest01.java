package kr.or.shi.variable;

public class VarTest01 {
 public static void main(String[] args) {
    int year = 2021;
    int age = 20;
    
 /*
 * sys를 입력하고 컨트롤+스페이스를 누르면 자동완성 기능이 실행된다.(인텔리전스 기능)
 */
    System.out.println(year);
    System.out.println(year + age);
    
    String str = new String("자바");
    System.out.println(str);
    System.out.println(str.toString());
/*
 * 사용자정의 클래스이거나 toString() 재정의를 하지 않은
 * 클래스의 참조변수는 출력을 하게되면, 클래스타입@16진수(주소)
 */
    Object obj1 = new Object();
    System.out.println(obj1);
    System.out.println(obj1.toString());
    
    /*
     * 리터럴(literal) : 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함.
     * 정수 리터럴은 int로 저장.
     * - 정수의 범위가 넘어가는 경우는 L,l을 써줘야 함.
     * 실수 리터럴 double로 저장.
     * - float로 사용하려는 경우는 F,f 식별자를 써줘야 함.
     */
    
    //아래코드에서 L는 long를 지정하기 위해서 접미사 L,l를 붙임.
    long result = 10L;
    
    //아래코드에서 F는 float(실수)를 지정하기 위해서 접미사 동일하게 F,f를 붙임.
    
    float result2 = 10.1F;
    double dou = 9.999;
    
    char ch = 'A';
    System.out.println("ch : " + ch);
    System.out.println("long 타입 출력 : " + result);
    System.out.println(result2);
    System.out.println(dou);
    System.out.println(str + "를 공부합니다!");
    System.out.println(obj1 + "자바");
    
 }
}
