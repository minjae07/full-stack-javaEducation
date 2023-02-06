package kr.or.shi.writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterTest04 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:\\workspace-java\\test9.txt");
		String str = "안녕하세여. 자바 IO기반의 입출력을 공부하고 있어요.";
		
		writer.write(str);
		writer.flush();
		System.out.println("파일이 생성되었습니다.");
		
		
		writer.close();
		
	}
}
