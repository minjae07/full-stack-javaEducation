package kr.or.shi.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest02 {

	public static void main(String[] args) throws Exception {
		
		OutputStream oStream = new FileOutputStream("C:\\workspace-java\\write2.txt");
		byte[] data = "ABC가나다".getBytes();
		/*
		 * EUC-KR, x-windows-949는 한글을 2바이트로 인식, UTF-8은 3바이트로 인식.
		 * ISO8859-1 캐릭터 셋에서는 한글을 1바이트로 인식
		 */
		
		System.out.println("data 바이트 배열의 크기 : " + data.length);
	
		oStream.write(data);
		System.out.println("저장이 완료되었습니다.");
		oStream.flush();
		
		System.out.println();
		//출력으로 내보낸 파일인 write2.txt파일을 읽어들인다.
		InputStream iStream = new FileInputStream("C:\\workspace-java\\write2.txt") ;
		int count = 0;
		//UTF-8이 한글이 3바이트이므로 바이트배열을 3바이트 생성함.
		byte[] readBytes = new byte[3];
		int i=0;
		
		while((count = iStream.read(readBytes)) != -1) {
			i++;
			String str = new String(readBytes);		//디코딩
			System.out.println("읽은 값 : " + str);
			System.out.println("읽은 바이트 수 : " + count);
		}
		System.out.println("루팅 수 : " + i);
		
		
		
		iStream.close();
		oStream.close();
	}
}
