package kr.or.shi.abstractt01;

public abstract class KakaoSender2 extends ContentSender {
	private String content;

	public KakaoSender2(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public abstract void sendMessage(String recipient);
}
