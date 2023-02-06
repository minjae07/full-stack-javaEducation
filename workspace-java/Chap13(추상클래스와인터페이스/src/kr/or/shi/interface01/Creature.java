package kr.or.shi.interface01;

//인터페이스의 본질은 추상메서드
public interface Creature {

	public void method();					//abstract 생략가능하다. 컴파일러가 추가해줌.
	
	int MAX = 10;							//static final 생략가능하다. 컴파일시에 컴파일러가 추가해줌.
}
