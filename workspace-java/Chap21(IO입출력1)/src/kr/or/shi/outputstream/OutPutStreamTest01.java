package kr.or.shi.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class OutPutStreamTest01 {

	public static void main(String[] args) throws Exception {
		OutputStream oStream = new FileOutputStream("C:\\workspace-java\\write.txt");
		
		//"ABC"라는 문자열에서 바이트 배열을 얻어냄.(인코딩)
		byte[] data = "ABC".getBytes();
		System.out.println(Arrays.toString(data)); 		//아스키코드가 출력됨.
		
		//3번 루핑한다. 한 글자씩 보내기 때문에.
		for(int i=0; i<data.length; i++) {
			oStream.write(data[i]);
			System.out.println("저장이 완료되었습니다.");
			
			
		}
		/*
		 * write()를 사용하면 무조건 flush()를 호출하여, 반드시 메모리 버퍼를 
		 * 비우도록 한다. 습관화 하도록 한다.
		 */
		oStream.flush();
		System.out.println("저장이 완료되었습니다.");
		oStream.close();
	}
}
