package kr.or.shi.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());
		
		map.put("최지만", 95);
		map.put("류현진", 90);
		map.put("추신수", 80);
		map.put("류현진", 95);
		map.put("추신수", 100);
		
		//map은 중복된 키는 저장하지 않는다. 류현진과 추신수는 2번씩 저장되었다.
		System.out.println("사이즈 : " + map.size());
		
		//중복저장이 될 경우 마지막에 저장된 값으로 대체가 된다.(중요)
		System.out.println("류현진 : " + map.get("류현진"));
		System.out.println("추신수 : " + map.get("추신수"));
		
		//map컬렉션에 있는 key값만 Set계열로 바꾼다.
		Set<String> set = map.keySet();
		System.out.println("KeySet()을 이용해서 출력해 봄");
		
		//반복자 얻기
		Iterator<String> iterator =  set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("============================");
		
		//Map컬렉션의 Map.Entry객체를 대상으로 Set계열로 바꾼다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("entrySet()을 이용해서 출력해 봄");
		//반복자 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " : " + value);
		
		}
		System.out.println("============================");
		
		//전체 객체 삭제
		map.clear();
		System.out.println("총 MapEntry 수 : " + map.size());
	}
}
