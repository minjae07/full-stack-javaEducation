package kr.or.shi.polymorphism01;

public class PlayerTest {
	
	public static void main(String[] args) {
		
		//다형성 미적용 코드
		Player player = new Player("메좆", 37, 10, 10);
		player.info();
		System.out.println();
		
		//다형성 적용된 코드
		/*
		 * 필드의 다형성.
		 * 하지만, 참조변수(필드)의 원타입은 벗어나지 못함.
		 * 그래서 Striker 클래스에 있는 getShoot()메서드는 player2 참조변수가 접근이 안됨.
		 * 
		 * 메서드에서 상속관계에 있다면, 자손클래스에서 오버라이딩을 하게 되면
		 * 현재 참조하고 있는 인스턴스의 메서드를 호출함.
		 */
		Player player2 = new Striker("킹갓두", 38, 7, 100, 999);
		player2.info();
		Player player3 = new Striker("메슬렁", 35, 10, 10, 0);
		player3.info();
	}

}
