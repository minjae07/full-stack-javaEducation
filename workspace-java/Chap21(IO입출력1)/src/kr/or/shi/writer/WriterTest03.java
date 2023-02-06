package kr.or.shi.writer;

import java.io.FileWriter;
import java.io.Writer;



public class WriterTest03 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:\\workspace-java\\test8.txt");
		char[] str ="심사임당입니다".toCharArray();
		
		
		writer.write(str, 1, 4);
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		
		writer.close();
	
	
	
	
	
	}
	
}
