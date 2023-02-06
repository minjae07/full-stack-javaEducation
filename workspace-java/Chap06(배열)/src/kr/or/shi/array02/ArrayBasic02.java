package kr.or.shi.array02;

/*
 * 문자배열을 만들어 A-Z까지 배열에 저장하고 이를 다시 출력하기
 */
public class ArrayBasic02 {
	
	public static void main(String[] args) {             
		
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<
				alpahbets.length; i++) {
			alpahbets[i] = ch++;
			
		}
		
		/*
		 * 향상된 for문 -- 배열의 n개 요소를 0부터 n-1까지 순차적으로 간단하게 사용할 수 있음.
		 * for(변수 : 배열) {
		 * 
		 * }
		 */
		for(char alpha : alpahbets) {
			System.out.println(alpha + ", "+ (int)alpha);
		}
		
		
		
		
		
	}

}
