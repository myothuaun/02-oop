package myy17.anonymous_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.greet();
		
		Person p1 = new Student();
		p1.greet();
		
		Person p2 = new Person() {
			@Override
			public void greet() {
				System.out.println("i am a anonymous class");
			}
		};
		p2.greet();
		
		Machine mac = new Machine() {
			@Override
			public void start(String text) {
				System.out.println("i am a anonymous class");
				System.out.println("text is "+text);
				
			}
		};
		mac.start("hello");

	}

}
