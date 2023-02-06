package kr.or.shi.oop;

/*
 * 버스타고 학교가는 학생의 과정을 객체지향 프로그래밍으로 구현한다.
 * 
 * 이순신과 이도는 각각 버스와 지하철을 타고 학교에 갑니다.
 * 이순신은 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
 * 이도는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
 * 
 * 두 학생이 버스와 치하철을 타는 상황을 구현해 보시오.
 */

public class Student {
	String studentName;
	int money;
	public Student(String studentName, int money) {
		//super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money+ "원 입니다.");
	}
	

}
