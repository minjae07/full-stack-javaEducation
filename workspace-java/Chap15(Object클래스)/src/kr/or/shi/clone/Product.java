package kr.or.shi.clone;

import java.util.Arrays;

//클래스의 복제가 가능하게 하려면, java.lang.cloneable인터페이스를 구현해야 한다.
public class Product implements Cloneable {
	
	private String id;
	private String name;
	private int price;
	private int[] arr;
	private Apple apple;
	
	public Product(String id, String name, int price, int[] arr, Apple apple) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
		this.apple = apple;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int[] getArr() {
		return arr;
	}
	
	public Apple getApple() {
		return apple;
	}
	
	@Override
	public String toString() {
		return "상품id : " +this.getId()+"\n" + 
				"상품이름 : " +this.getName()+"\n"+
				"상품가격 : " +this.getPrice()+"\n"+
				"배열값 : " +Arrays.toString(this.arr)+"\n"+
				"Apple값 : " + this.apple.price;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
			//얕은 복제가 여기 일어남 (참조변수의 값들은 번지 공유)
		Product cloned = (Product)super.clone();
		
		//참조타입들을 복제하는 코드
		cloned.arr = Arrays.copyOf(this.arr, this.arr.length);		//배열복제
		cloned.apple = new Apple(this.apple.price);					//클래스 복제
		
		return cloned;
	}
	public Product getProduct() {
		Product cloned = null;
		
		try {
			cloned = (Product)this.clone();		//여기서 clone()은 Object 클래스의 얕은 복제
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cloned;
	}
}
