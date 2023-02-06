package kr.or.shi.string02;

public class IndexOfTest {

	public static void main(String[] args) {
		
		String str = "오늘은 자바 공부하기가 좋네요";
		//indexOf() : 찾기기능을 할때 자주 쓰인다.
		int index = str.indexOf("공부");
		System.out.println("공부의 시작 배열번지 번호 : " + index);

		if(str.indexOf("공부")!= -1) {
		System.out.println("공부와 관련된 내용이군요.");
		}
		else {
			System.out.println("공부와 관련없는 내용이군요.");
		}
	}

}
