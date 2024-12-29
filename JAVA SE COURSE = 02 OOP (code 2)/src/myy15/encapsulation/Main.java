package myy15.encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student x = showInfo();
		System.out.println("student roll number is "+x.getRollNo()+" and student name is "+x.getName());
		

	}
	public static Student showInfo() {
		Student sd = new Student(1,"myo");
		return sd;
	}

}
