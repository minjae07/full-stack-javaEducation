package kr.or.shi.writer;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

public class WriterTest01 {

	public static void main(String[] args) throws Exception {
		
		
		char[] str = "이순신".toCharArray();
		System.out.println(Arrays.toString(str));
		
		Writer writer = new FileWriter("C:\\workspace-java\\test6.txt");
		for(int i=0; i<str.length; i++) {
			//한 문자씩 보내는 형태 (덜 효율적)
			writer.write(str[i]);
			System.out.println("루핑수 : " + i);
		}
		writer.flush();					//강제로 버퍼를 비운다
		System.out.println("파일이 생성되었습니다.");
		writer.close();
	
	
	}
}
