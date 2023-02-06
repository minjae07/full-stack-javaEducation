package kr.or.shi.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderTest03 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:\\workspace-java\\test5.txt");
		char[] cArr = new char[4];
		
		int readData = reader.read(cArr, 1, 3);
		System.out.println("읽은 문자 수 : " + readData);
		
		for(int i=0; i<cArr.length; i++) {
			System.out.println(i + "번째 문자 : " + cArr[i]);
		}
		
		reader.close();
	}
}
