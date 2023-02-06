package kr.or.shi.abstractt01;

public abstract class ContentSender {

	private String title;
	private String name;
	
	//생성자
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getName() {
		return name;
	}
	
	//추성메서드 => 상속을 통해서 반드시 재정의(overiding)되어야 비로소 인스턴스를 생성할 수 있다.
	public abstract void sendMessage(String content);
	}

