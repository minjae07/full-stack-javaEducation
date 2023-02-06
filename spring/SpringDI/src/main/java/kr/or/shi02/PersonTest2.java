package kr.or.shi02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest2 {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		PersonSerivce person = (PersonSerivce)factory.getBean("personService1");
		person.sayHello();
		System.out.println();
		
		PersonSerivce person2 = (PersonSerivce)factory.getBean("personService2");
		person2.sayHello();
	}

}
