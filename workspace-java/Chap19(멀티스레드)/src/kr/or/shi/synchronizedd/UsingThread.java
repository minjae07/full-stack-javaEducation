package kr.or.shi.synchronizedd;

public class UsingThread extends Thread {
	
	//공유객체
	private Toilet toilet;
	
	public UsingThread(Toilet toilet, String name) {
		this.toilet = toilet;
		this.setName(name);
	}
	
	@Override
	public void run() {
		try {
			this.toilet.use();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
