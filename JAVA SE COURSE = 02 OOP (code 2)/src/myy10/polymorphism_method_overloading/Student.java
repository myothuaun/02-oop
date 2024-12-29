package myy10.polymorphism_method_overloading;

public class Student {
	public void showInfo() {
		System.out.println("no arguments");
	}
	public void showInfo(int id) {
		System.out.println("id is"+id);
	}
	
	public void showInfo(String name) {
		System.out.println("name is"+name);
	}
	
	public void showInfo(int id, String name) {
		System.out.println("id is "+id+" and name is "+name);
	}
	
	

}
