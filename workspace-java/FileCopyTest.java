package kr.or.shi.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fInputStream = new FileInputStream("C:\\workspace-java\\write3.txt");
		FileOutputStream fOutputStream = new FileOutputStream("C:\\workspace-java\\write3_복사본.txt");
		
		byte[] readBytes = new byte[1000];
		int data = 0;
		while((data = fInputStream.read(readBytes)) != -1) {
			fOutputStream.write(readBytes);
		}
		fOutputStream.flush();
		System.out.println("C드라이브에 write3_복사본.txt파일이 생성되었습니다.");
		
		fOutputStream.close();
		fInputStream.close();
	
	
	
	}
}
