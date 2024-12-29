package myy16.abstract_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mac1 = new Car();
		Machine mac2 = new Camera();
		mac1.start();
		mac1.stop();
		
		mac2.start();
		mac2.stop();
		
		mac1.showInfo();
		mac2.showInfo();
		

	}

}
