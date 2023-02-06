package kr.or.shi.vector;

import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		System.out.println("용량 : " + vector.capacity());
		System.out.println("저장된 객체수 : " + vector.size());
		
		vector.add(new Board("제목1", "내용1", "작성자1"));
		vector.add(new Board("제목2", "내용2", "작성자2"));
		vector.add(new Board("제목3", "내용3", "작성자3"));
		vector.add(new Board("제목4", "내용4", "작성자4"));
		vector.add(new Board("제목5", "내용5", "작성자5"));
		vector.add(new Board("제목6", "내용6", "작성자6"));
		vector.add(new Board("제목7", "내용7", "작성자7"));
		vector.add(new Board("제목8", "내용8", "작성자8"));
		vector.add(new Board("제목9", "내용9", "작성자9"));
		vector.add(new Board("제목10", "내용10", "작성자10"));
		vector.add(new Board("제목11", "내용11", "작성자11"));
		
		System.out.println("용량 : " + vector.capacity());
		System.out.println("저장된 객체수 : " + vector.size());
		
		vector.remove(2);
		System.out.println("용량 : " + vector.capacity());
		System.out.println("저장된 객체수 : " + vector.size());
		
		System.out.println("------------------------------------");
		for(int i=0; i<vector.size();i++) {
			if(vector.get(i) instanceof Board) {
				Board board = (Board)vector.get(i);					//다운캐스팅 (Object => Board)
				board.show();
				System.out.println();
			}
		}
		
	}

}
