package kr.or.shi.inheritancereview;

/*
 * -다형성(Polymorphism)이란?
 * 		1) 하나의 코드가 여러 자료형으로 구현되어 실행 되는 것.
 * 		2) 같은 코드에서 여러 다른 실행 결과가 나옴.
 * 		3) 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임.
 * 		4) 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들 수 있음.
 * 		5) 여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있음.
 */

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest01 {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest01 test = new AnimalTest01();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
	}

}















