package kr.or.shi.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderTest02 {

	public static void main(String[] args) throws Exception {
	
		Reader reader = new FileReader("C:\\workspace-java\\test5.txt");
		int readData;
		char[] cArr = new char[2];
		//String str = "";							//새로운 인스턴스를 계속 생성해서 작업
		StringBuilder sBuilder = new StringBuilder();	//하나의 인스턴스만 만들어서작업
		
		while((readData = reader.read(cArr)) != -1) {
			//str += new String(cArr, 0, readData);		//읽은 문자를 문자열로 생성
			sBuilder.append(cArr);
			System.out.println("읽은 문자수 : " + readData);
		}
		
		System.out.println(sBuilder); 		//문자열 출력
		
		reader.close();
		
	}
}
