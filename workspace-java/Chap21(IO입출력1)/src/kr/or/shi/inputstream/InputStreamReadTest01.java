package kr.or.shi.inputstream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadTest01 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("C:\\workspace-java\\test.txt");
		int readByte;			//읽은 바이트 수를 리턴받는 변수
		
		/*
		 * InputStream의 read()는 더 이상 읽을게 없다면, -1을 리턴함
		 */
		while( (readByte = iStream.read()) != -1) {
			System.out.println("읽은 데이터 (1바이트) :" + readByte); 	//아스키코드값을 출력
			System.out.println("읽은 문자 : " + (char)readByte); 		//강제타입캐스팅 후 문자로 출력
		}
		
		//이클립스의 디폴트 캐릭터셋
		System.out.println(Charset.defaultCharset());
		iStream.close();
	}
}
