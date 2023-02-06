package kr.or.shi.object02;

public class FarmMachine {

	//속성(특징)
	int price ;                  //가격
    int year;                    //연식
    String color;  				 //색상
    
    //동작/기능/행위(method) --> 공통적인 동작을 생각한다.
    /*
     * 반환할 타입 : return type --> 반환할 값이 있느냐? 없느냐? --> 없으면 void(빈 공간 , 공허함 empty)
     * 			--> 이 메서드(함수)는 호출하면 결과로써 특별히 반환되는 값이 없이 수행하는 메서드.
     * 
     */
    public void move() {
    	System.out.println("Farm-machine is moving");
    }
	public void dig() {
		System.out.println("Farm-machine is digging");
	}
	public void grind() {
		System.out.println("Farm-machine is grinding");
	
}
}