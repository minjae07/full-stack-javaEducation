package kr.or.shi.inheritancereview;

/*
 * 다운 캐스팅과 instanceof
 * 
 *  	1. Downcasting
 *  		1)업캐스팅된 클래스를 다시 원래의 타입으로 형변환
 *  		2)하위 클래스로의 형변환은 명시적으로 해야 함.
 *  	2.instanceof를 이용하여 인스턴스의 형 체크
 *  		1)원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드
 *  		2)맞으면 true, 아니면 false를 반환함.
 */

//class Robot
//public void move() {
//	System.out.println("로봇이 움직입니다.");
//}
//public void clean() {
//	System.out.println("깨끗히 청소합니다.");
//}
public class AnimalTest02 {
	
	public void testDownCasting(Animal animal) {
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBooks();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("error");
		}
	}
	
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest02 anTest02 = new AnimalTest02();
		anTest02.testDownCasting(eAnimal);
		anTest02.testDownCasting(tAnimal);
		anTest02.testDownCasting(hAnimal);
		//anTest02.testDownCasting(robot);
	}

}
