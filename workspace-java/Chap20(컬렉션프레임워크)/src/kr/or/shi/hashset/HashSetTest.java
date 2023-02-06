package kr.or.shi.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		System.out.println("사이즈 : " + set.size());
		
		set.add("JAVA");
		set.add("JAVA");
		set.add("JAVA");
		set.add("JAVA");
		set.add("JAVA");
		set.add("JAVA");
		
		/*
		 * Set계열은 중복 저장이 안된다. 순서유지를 하지도 않는다.
		 * Set계열은 null값도 저장가능하지만, 오직 1개만 저장된다.
		 */
		System.out.println("사이즈 : " + set.size());
		System.out.println("==========================");
		
		set.add("MYSQL");
		set.add("JDBC");
		set.add("JSP");
		set.add("myBATIS");
		set.add(null);
		set.add(null);
		
		System.out.println("사이즈 : " + set.size());
		System.out.println("==========================");
		
		//반복자를 set을 통해서 얻는다.
		Iterator<String> iterator = set.iterator();
		
		//가져올게 있느냐? 있으면 true, 없으면 false를 리턴한다.
		while(iterator.hasNext()) {
			String element = iterator.next();	//객체를 가져온다.
			System.out.println(element);
			System.out.println();
			System.out.println("사이즈 : " + set.size());
			System.out.println("==========================");
		}
		
		set.remove("JDBC");
		set.remove("myBATIS");
		System.out.println("사이즈 : " + set.size());
		System.out.println("==========================");
		
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("==========================");
		
		set.clear();
		if(set.isEmpty()) 
			System.out.println("객체가 없습니다.");
		else
			System.out.println("객체가 존재합니다.");
	}
}
