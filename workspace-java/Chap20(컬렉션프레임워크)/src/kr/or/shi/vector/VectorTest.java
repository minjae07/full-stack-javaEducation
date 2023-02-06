package kr.or.shi.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		/*
		 * 용량이 5인 벡터를 생성한다. 생성자의 매개값을 주지 아니하면,
		 * 기본적으로 10개의 용량을 가진 벡터가 생성된다.
		 */
		Vector<Board> vector = new Vector<>(5);
		System.out.println("용량 : " + vector.capacity());
		System.out.println("초기 사이즈 : " + vector.size());
		System.out.println("====================================");
		
		//객체추가
		vector.add(new Board("제목1", "내용1", "글쓴이1"));
		vector.add(new Board("제목2", "내용2", "글쓴이2"));
		vector.add(new Board("제목3", "내용3", "글쓴이3"));
		vector.add(new Board("제목4", "내용4", "글쓴이4"));
		vector.add(new Board("제목5", "내용5", "글쓴이5"));
		System.out.println("용량 : " + vector.capacity());
		System.out.println("중반 사이즈 : " + vector.size());
		System.out.println("====================================");
		
		//객체 삭제
		vector.remove(2);				//배열복사
		vector.remove(3);				//배열복사
		System.out.println("용량 : " + vector.capacity());
		System.out.println("후반 사이즈 : " + vector.size());
		System.out.println("====================================");
		
		//용량만 확보
		vector.ensureCapacity(20);		//배열복사
		System.out.println("용량 : " + vector.capacity());
		System.out.println("후반 사이즈 : " + vector.size());
		System.out.println("====================================");
		
		//null값 포함하여 size값 변경
		vector.setSize(7);				//배열복사
		System.out.println("용량 : " + vector.capacity());
		System.out.println("초후반 사이즈 : " + vector.size());
		System.out.println("====================================");
		
		//size로 잡히지 않은 null값은 삭제해 준다.
		vector.trimToSize();
		System.out.println("용량 : " + vector.capacity());
		System.out.println("초초후반 사이즈 : " + vector.size());
		System.out.println("====================================");
		
		vector.setSize(3); 				//배열복사
		System.out.println("용량 : " + vector.capacity());
		System.out.println("초초초후반 사이즈 : " + vector.size());
		System.out.println("====================================");
		
		//향상된 for문을 사용
		for(Board board : vector) {
			System.out.println(board.subject + board.content + board.writer);
		}
		System.out.println("====================================");
		
		//반복자로 출력하기
		Iterator<Board> iterator = vector.iterator();
		while(iterator.hasNext()) {						//가져올 데이터가 있느냐?
			Board board = iterator.next();				//있으면 가져와라
			System.out.println();
			System.out.println(board.subject + board.content + board.writer);
		}
	}
}
