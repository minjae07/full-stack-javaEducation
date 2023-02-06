package kr.or.shi.writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopyReaderWriter {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:\\workspace-java\\FileCopyTest.java");
		Writer writer = new FileWriter("C:\\workspace-java\\FileCopyTest_복사본.java");
	
		String str = "";
		int readBytes;
		char[] cArr = new char[1000];
		int i = 0;
		
		while((readBytes = reader.read()) != -1) {
			String str1 = new String(cArr);
			str += str1;
			i++;
			System.out.println("루핑수 : " + i);
			System.out.println("읽은 바이트 수 : " + readBytes);
		}
		writer.write(str);
		writer.flush();
		System.out.println("C드라이브에 FileCopyTest_복사본.java파일이 생성되었습니다.");
	
	
		writer.close();
		reader.close();
	}
}
