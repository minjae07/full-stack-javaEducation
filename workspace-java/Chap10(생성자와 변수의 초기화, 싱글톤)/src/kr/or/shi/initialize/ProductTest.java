package kr.or.shi.initialize;

import java.util.Arrays;

public class ProductTest {

	public static void main(String[] args) {
		Product product1 = new Product();
		System.out.println("Product.number : "+Product.number+
							", countNo : " + product1.countNO);
		
		Product product2 = new Product();
		System.out.println("Product.number : "+Product.number+
							", countNo : " + product2.countNO);
		
		Product product3= new Product();
		System.out.println("Product.number : "+Product.number+
							", countNo : " + product3.countNO);
		System.out.println("---------------------------------");
		
		System.out.println(Arrays.toString(product1.arr));
		System.out.println(Arrays.toString(product2.arr));
		System.out.println(Arrays.toString(product3.arr));
		
		
		
		
	}

}
