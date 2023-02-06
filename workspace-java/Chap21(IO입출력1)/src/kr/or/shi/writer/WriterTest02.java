package kr.or.shi.writer;

import java.io.FileWriter;
import java.io.Writer;



public class WriterTest02 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:\\workspace-java\\test7.txt");
		char[] str ="심사임당".toCharArray();
		
		/*
		 * write()의 매개변수 타입이 문자배열이다. 이전 파일의 write(int b)보다
		 * 훨씬 효율적이다.
		 */
		writer.write(str);
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		
		writer.close();
	
	
	
	
	
	}
	
}
