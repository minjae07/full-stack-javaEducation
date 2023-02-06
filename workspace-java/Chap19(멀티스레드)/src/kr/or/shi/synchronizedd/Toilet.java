package kr.or.shi.synchronizedd;

public class Toilet {
	
	//플래그 (flag) 변수
	private boolean seat;

	public synchronized void use() throws Exception {
		String name = Thread.currentThread().getName();
		
		//누군가 화장실에 들어왔을 때
		if(this.seat == false) {
			System.out.println(name + "가/이 화장실에 입장하였습니다.");
			this.seat = true;
			
				Thread.sleep(1000);
				System.out.println(name + "가/이 말 : 시원하노 ㅋㅋ");
				
				this.seat = false;
				System.out.println(name+ "가/이 화장실 사용을 마쳤습니다.");
				System.out.println();
	
	}
		else {
			System.out.println(name + "가/이 화장실 사용중입니다. 기다려!");
		}
	}	
}
