package kr.or.shi.wildcard;

public class Course<T> {
	
	private String name;
	private T[] students;
	/*
	 * 생성자 (아직 T타입이 결정되지 않았기 때문에 두번째 파라미터는 사이즈로 함 -- 배열을 생성할 수 없음.값이 정해지지 않아서)
	 */
	
	public Course(String name, int size) {
		super();
		this.name = name;
		this.students = (T[])new Object[size];
	}
	
	public void add(T t) {
		for(int i=0;i<this.students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	
}
