package kr.or.shi.decision03;

public class RandomTest {

	public static void main(String[] args) {
	
		//Math.reandom()값은 0.000000~0.999999사이의 값을 발생시킴.
		//System.out.println(Math.random());
				
	    //주사위 숫자 : 랜덤을 발생
		int num = (int)(Math.random()*6) + 1;       //1~6까지 범위의 수를 발생시키는 식
		//int num = (int)(Math.random()*45) + 1;        //로또 : 1~45까지의 숫자 중 6새를 맞히면 됨.
//		System.out.println(num);

//		if(num == 1) {
//			System.out.println("1이 나왔네요!");
//		}
//		else if (num == 2){
//			System.out.println("2이 나왔네요!");
//		}
//		else if (num == 3){
//			System.out.println("3이 나왔네요!");
//		}
//		else if (num == 4){
//			System.out.println("4이 나왔네요!");
//		}
//		else if (num == 5){
//			System.out.println("5이 나왔네요!");
//		}
//		else{
//			System.out.println("6이 나왔네요!");
//		}
		
		//swith 구문
		
		switch(num) {
		case 1:
			System.out.println("1이 나왔네요!");
			break;
		case 2:
			System.out.println("2이 나왔네요!");
			break;
		case 3:
			System.out.println("3이 나왔네요!");
			break;
		case 4:
			System.out.println("4이 나왔네요!");
			break;
		case 5:
			System.out.println("5이 나왔네요!");
			break;
		case 6:
			System.out.println("6"
					+ "이 나왔네요!");
			break;
		}
		
	}

}

















