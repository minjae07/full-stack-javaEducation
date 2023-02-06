package kr.or.shi.abstractt01;

public class SenderTest {
	
	public static void main(String[] args) {
		
		//추상클래스이니 절대 인스턴스를 생성할 수가 없음
		//ContentSender contentSender = new ContentSender("","")
		
		//추상클래스도 조상이니까 필드의 다형성 적용됨.
		ContentSender contentSender1 = new KakaoSender("카카오톡", "김원효", "안녕 해피바이러스!");
		contentSender1.sendMessage("박지선");
		System.out.println();
		
		ContentSender contentSender2 = new KakaoSender("SMS", "박성광", "네 귀하고 씩씩한 삶!");
		contentSender2.sendMessage("박지선");
	}

}
