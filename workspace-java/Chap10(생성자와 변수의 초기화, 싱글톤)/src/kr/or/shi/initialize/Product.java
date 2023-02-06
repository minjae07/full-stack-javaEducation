package kr.or.shi.initialize;

public class Product {

	static int number = 0;					//공유변수
	int countNO;							//인스턴스별 개별생성
	int [] arr = new int [10];
	
	{
		System.out.println("인스턴스 초기화 블럭 호출됨.");
		++number;
		this.countNO = Product.number;
		
		//복잡한 초기화 같은 경우는 초기화 블럭 실행문에서 작성하면 가독성이 좋아짐.
		for(int i=0;i<arr.length; i++) {
			this.arr[i] = (int)(Math.random()*10) + 1;
		}
		
	}
	
	//단 한 번만 실행됨.
	static {
		System.out.println("정적 초기화 블럭 호출됨.");
	}
	
	public Product() {
		System.out.println("기본생성자 호출됨.");
	}
}
