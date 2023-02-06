package kr.or.shi.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 1. ArrayList의 장점과 단점
 * 	-장점 : 데이터를 읽는데 걸리는 시간(accesstime)이 짧다.
 * 	-단점 : 크기를 변경하는 경우 새로운 배열을 생성 후 데이터를 복사 해야함. => 메모리 낭비.
 * 			비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.
 * 2. LinkedList
 * 	-빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 좋은 성능을 발휘한다.
 */
public class ArrayListTest02 {

	//ArrayList안의 내용을 출력하는 메서드 작성
	public static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 : " + list2.toString());
	}
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);		//자동박싱
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(0);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		//정렬하기
		System.out.println("정렬 후");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//포함관계
		System.out.println("list1컬렉션에 list2컬렉션의 모든 요소가 들어있는가?");
		System.out.println(list1.contains(list2));
		System.out.println();
		
		list2.add("B");				//배열 복사가 일어나지 않음
		list2.add("C");				//배열 복사가 일어나지 않음
		print(list1, list2);
		
		list2.add(3, "A");		//배열 복사가 일어난다.
		print(list1, list2);
		
		//대체하기
		list2.set(3, "AA");
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제하기
		System.out.println("포함된 객체 삭제하기");
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			print(list1, list2);
		}
	}
}
