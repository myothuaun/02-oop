package myy11.polymorphism_method_overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.showInfo();
		Student sd = new Student();
		sd.showInfo();
		
		Person person1 = sd;
		person1.showInfo();
		

	}

}
