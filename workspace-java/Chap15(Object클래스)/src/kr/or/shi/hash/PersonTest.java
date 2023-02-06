package kr.or.shi.hash;

import java.util.HashSet;

public class PersonTest {
	
	public static void main(String[] args) {
		
		/*
		 * 사용자 정의 클래스에서 hash시리즈들은 반드시 hashcode()와 equal()를 중복체크를 하는 것임.
		 * 오버라이딩해서 중복저장이 안되게 해줘야함.
		 */
		HashSet hashSet = new HashSet();
		
		System.out.println("가"); 
		System.out.println("가".hashCode());
		System.out.println();
		
		String str1 = new String("가");
		String str2 = new String("가");
		System.out.println(str1.hashCode());		//String은 hashCode()를 오버라이딩 해놓았음.
		System.out.println(str2.hashCode());
		
		hashSet.add(str1);
		hashSet.add(str2);
		System.out.println("저장된 객체수 : " + hashSet.size());		//중복저장되었다.
	
	
		Person person1 = new Person("류현진",30);
		Person person2 = new Person("류현진", 30);
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println("저장된 객체수 : " + hashSet.size());

}
}
