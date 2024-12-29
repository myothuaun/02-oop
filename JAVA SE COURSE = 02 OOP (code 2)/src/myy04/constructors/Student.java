package myy04.constructors;

public class Student {
	int id;
	String name;
	public Student() {
		System.out.println("constructor with no arguments");
	}
	public Student(int id) {
		System.out.println("constructor with id");
	}
	public Student(String name) {
		System.out.println("constructor with name");
	}
	public Student(int id, String name) {
		System.out.println("constructor with id and name");
	}

}
