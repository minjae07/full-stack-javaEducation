package kr.or.shi.multitype;

public class Util {
	
	/*
	 * <T>는 제너릭 타입 메서드를 칭하는 것이며,
	 * 리턴타입과 매개변수 타입을 동일하게 <T>타입으로 가져가야 한다.
	 */
	public static <T> Person<T> changing(T t){
		
		Person<T> person = new Person<>();
		person.setT(t);
		return person;
		
	}

}
