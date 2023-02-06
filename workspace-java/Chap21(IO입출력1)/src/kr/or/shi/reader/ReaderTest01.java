package kr.or.shi.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderTest01 {

	public static void main(String[] args) throws Exception {
		//Reader 클래스는 문자특화 클래스로써 하위클래스인 FileReader를 생성해서 대입.
		Reader reader = new FileReader("C:\\workspace-java\\test5.txt");
		int readData;
		
		//readData는 int값으로 끝 2바이트(1문자가 2바이트라서)에 저장됨.
		while((readData = reader.read()) != -1) {
			System.out.println("읽은 문자 : "+ (char)readData);
		}
		
		reader.close();
		
	
	}
}
