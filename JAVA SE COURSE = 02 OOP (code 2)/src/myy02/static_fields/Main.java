package myy02.static_fields;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.count = 10;
		System.out.println(Student.count);
//		Student sd1 = new Student();
//		sd1.count = 5;   //don't
		
//		Student sd2 = new Student();
//		sd2.count = 10;  //don't
		
		Student.count = 20;
		System.out.println("After : "+Student.count);
		
	}

}
