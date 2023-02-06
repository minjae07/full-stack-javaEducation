package kr.or.shi.arrayList;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();	//기본적으로 10개의 방을 생성.
		System.out.println("총 크기 : " + list.size());
		
		list.add("111");			// 순차적 추가
		list.add("222");
		list.add("333");
		list.add("222");
		
		list.add(333);				//list.add(new Integer(333)
		System.out.println("총 크기 : " + list.size());
		System.out.println("ArrayList의 주소 : " + list.hashCode());
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		System.out.println();
		
		//0번째 인덱스에 "333" 추가하기
		list.add(0, "333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		System.out.println();
		
		//앞에서부터 검색하여 "333"을 삭제한다 (가까운것 한개만 삭제)
		list.remove("333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		System.out.println(list.remove("333"));
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//저장된 객체의 인덱스를 찾아오기 (없으면 -1 리턴한다)
		System.out.println("index = " + list.indexOf("333"));
		System.out.println("index = " + list.indexOf(333));
		
		//객체 전부삭제
		//list.clear();
		//System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		/*
		 * 앞에서 부터 삭제했을때 남는 이유는 
		 * 인덱스 0을 삭제할 때, i가 0이니까 당연히 0인덱스에 있는 객체는 삭제되지만,
		 * 이후 i값이 증가하면서 제대로 삭제가 되지 않는 것이다.
		 * 삭제를 시킬려면 항상 뒤에서부터 삭제를 해주는 것이다.
		 */
//		for(int i=0; i<list.size(); i++) {
//			list.remove(i);
//			System.out.println("ArrayList에 있는 값 : " + list.toString());
//		}
//		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		/*
		 * size() 값이 4인데, 인덱스는 3까지 있으니까 예외발생하게됨.(0부터 시작)
		 */
		for(int i = list.size()-1; i>=0; i--) {
			list.remove(i);
			System.out.println("ArrayList에 있는 값 : " + list.toString());
		}
		System.out.println("ArrayList에 있는 값 : " + list.toString());
	}
}
