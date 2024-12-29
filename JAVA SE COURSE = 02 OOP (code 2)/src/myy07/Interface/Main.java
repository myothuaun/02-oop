package myy07.Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Cycle cycle = new Cycle();
		test(car);
		test(cycle);
	}
	public static void test(Machine mac) {
		mac.start();
		mac.stop();
	}

}
