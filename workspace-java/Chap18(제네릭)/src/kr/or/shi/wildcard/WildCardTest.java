package kr.or.shi.wildcard;

import java.util.Arrays;

public class WildCardTest {
	
	public static void registerCourse(Course<?> course) {				//?는 어떠한 객체도 다 받겠다.
		System.out.println(course.getName()+"수강생 : " +
							Arrays.toString(course.getStudents()));
	}
	
	//Student이거나 Student를 상속받은 클래스 (상위타입제한)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " +
									Arrays.toString(course.getStudents()));		
	}
	
	//worker클래스이거나 그 상위 클래스들만 들어올 수 있다.(하위타입제한)
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : " +
				Arrays.toString(course.getStudents()));	
	}
	
	public static void main(String[] args) {
//		//registerCourse(new Object<Object>()); 	//Course타입만 가능
//		registerCourse(new Course<Object>("대구대 과정 ", 3));
//		registerCourse(new Course<Person>("일반인 과정 ", 5));
//		registerCourse(new Course<Student>("학생 과정 ", 10));
//		registerCourse(new Course<Worker>("직장인 과정 ", 8));
//		registerCourse(new Course<HighStudent>("고등학생 과정 ", 7));
//		System.out.println();
//		
//		//registerCourseStudent(new Course<Person>("일반인 과정", 5));
//		registerCourseStudent(new Course<Student>("학생 과정 ", 5));
//		//registerCourseStudent(new Course<Worker	>("직장 과정 ", 5));
//		registerCourseStudent(new Course<HighStudent>("고등학생 과정", 8));
//		System.out.println();
//		
//		registerCourseWorker(new Course<Person>("일반인 과정", 5));
//		//registerCourseWorker(new Course<Student>("학생 과정", 10));
//		registerCourseWorker(new Course<Worker>("직장인 과정", 5));
//		//registerCourseWorker(new Course<HighStudent>("고등학생 과정", 10));
		
		Course<Person> pCourse = new Course<>("일반인 과정", 3);
		pCourse.add(new Person("일반인 1"));
		pCourse.add(new Person("일반인 2"));
		pCourse.add(new Person("일반인 3"));
		
		registerCourse(pCourse);
		registerCourseWorker(pCourse);
		//registerCourseStudent(pCourse);
		
		Course<Student> sCourse = new Course<>("학생 과정", 3);
		sCourse.add(new Student("김동준"));
		sCourse.add(new Student("김동준 1"));
		sCourse.add(new Student("김동준 2"));
		
		registerCourse(sCourse);
		registerCourseStudent(sCourse);
		registerCourseStudent(sCourse);
	}

}
