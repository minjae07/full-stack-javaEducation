package kr.or.shi.generic;

public class TVTest {
	
	public static void main(String[] args) {
		
		TV<String> tv = new TV<>();
		tv.setE("LG UHD AI TV");
		String tvName = tv.getE();
		System.out.println("나의 Tv는 " + tvName+ "입니다.");
		
		
		
	}

}
