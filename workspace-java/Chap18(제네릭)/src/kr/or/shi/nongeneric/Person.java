package kr.or.shi.nongeneric;

public class Person {
	
	private Object object;
	
	public Person() {
		
	}
	//리턴타입이 object => 모든 리턴타입으로 object로 하겠다.
	public Object getObject() {
		return object;
	}
	//매개변수가 object이다. => 모든 클래스를 다 매개변수
	public void setObject(Object object) {
		this.object = object;
	}
}
