package kr.or.shi.interfacereview02;

/*
 * 1. 인터페이스를 활용한 다형성 구현 (dao 구현하기)
 * 	1) 인터페이스 다형성
 * 		: 하나의 인터페이스를 여러 객체가 구현하게 되면
 * 		  클라이언트 프로그램은 인터페이스의 메서드를 활용하여
 * 		  여러 객체로 구현될 수 있음(다형성, Polymorphism)
 * 	2) 인터페이스를 활용한 dao구현하기
 * 		- DB에 회원 정보를 넣는 dao(data access object)를 여러 DB 제품이 지원될 수 있게 구현함.
 * 		- 환경파일(db.porperties)에서 database의 종류에 대한 정보를 읽고
 * 			그 정보에 맞게 dao 
 */

public class UserInfo {
	private String userId;
	private String passwd;
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
