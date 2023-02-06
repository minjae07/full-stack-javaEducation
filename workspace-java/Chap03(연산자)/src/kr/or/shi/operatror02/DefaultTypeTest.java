package kr.or.shi.operatror02;

public class DefaultTypeTest {

	public static void main(String[] args) {
		
		byte b1 = 127;
		byte b2 = 1;

     //byte b3 = b1 + b2;                       //byte + byte => int + int => int   
     
        /*
         * 해결 1번째 방법 : int형으로 받아주면 됨 (자동캐스팅)
         * 해결 2번째 방법 : 강제 캐스팅 해야됨.
         */
        
        int i1 = b1 + b2;
        byte b3 = (byte)(b1 + b2);
        System.out.println("i1=" +i1+ ", b3" + b3);
        //------------------------------------------------------
        
        char ch = 'A';                      //A는 아스키코드 값으로 65
        int i2 = ch + b2;                   //65 + 1
        System.out.println("i2 = " + i2);
		//------------------------------------------------------
        
        float f1 = 15.5f;
        //정수형 + 실수형  ==> 표현범위가 넓은 쪽으로 형변환 되어 연산 이루어짐.
        //int i3 = (b1 + f1);          //float = float + float
        float f2 = b1 + f1;
	    System.out.println("f2 = " + f2);
	    //------------------------------------------------------
	    
	    double d1 = 10.5;
	    //float f3 = f1 + d1;               //float + double = double
	    double d2=f1+d1;
	    System.out.println("d2 = " + d2);
		
	}

}
