package kr.or.shi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		//PersonService person1 = new PersonServiceImpl();
		PersonService person = (PersonService)factory.getBean("personService");
		person.sayHello();

	}

}
