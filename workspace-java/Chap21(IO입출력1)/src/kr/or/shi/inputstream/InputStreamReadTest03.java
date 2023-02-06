package kr.or.shi.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadTest03 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("C:\\workspace-java\\test3.txt");
		int count;
		byte[] readBytes = new byte[10];
		
		//시작 인덱스가 2이고 3개만 읽어서 저장하는 코드
		count = iStream.read(readBytes, 2, 3);
		System.out.println("읽은 바이트 수 : " + count);
		System.out.println();
		
		for(byte b : readBytes) {
			System.out.println("읽은 바이트 : " + (char)b);
			
		}
		
		iStream.close();
		
	}
}
