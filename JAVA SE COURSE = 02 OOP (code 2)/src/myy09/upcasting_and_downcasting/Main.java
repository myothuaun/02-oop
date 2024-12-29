package myy09.upcasting_and_downcasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mac = new Machine();
//		mac.start();
//		mac.stop();
		Car car = new Car();
//		car.start();
//		car.stop();
//		car.changeGear();
		
		
		
		Machine mac1 = car;
//		mac1.start();
//		mac1.stop();

		
		Car car1 =(Car) mac1;
		car1.start();
		car1.stop();
		car1.changeGear();
		

	}

}
