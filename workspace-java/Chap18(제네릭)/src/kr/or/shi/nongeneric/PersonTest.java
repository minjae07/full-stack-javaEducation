package kr.or.shi.nongeneric;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setObject("류현진");  				//업캐스팅(String -> Object) : 생략가능
		String str =(String)person.getObject();		//다운캐스팅(Object -> String)
		System.out.println(str);
		
		
	}

}
