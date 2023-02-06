package kr.or.shi.object01;

/*
 * 1) : 클래스란 무엇인가?
 * 		객체(인스턴스)를 생성하는 하나의 공장(=틀, 프레임, 템플릿, 판형 등등...)이다.
 * 2) : 클래스의 특징 --> 속성(attribute, field)
 * 		클래스의 동작 --> 메서드(method), 함수
 */
public class FieldInit /* extends Object */{
	
	//기본형 변수
	byte byteField;							//1 byte
	short shortField;                       //2 byte
	int intField;							//4 byte
	long longField;							//8 byte
	
	boolean booleanField;                   //1 byte
	char charField;							//2 byte
	
	float floatField;						//4 byte
	double doubleField;						//8 byte

	//참조형 변수
	int[] arrField;                         //4
	String strField;                        //4
}
