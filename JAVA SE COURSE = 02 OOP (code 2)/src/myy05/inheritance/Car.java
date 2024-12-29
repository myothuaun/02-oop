package myy05.inheritance;

public class Car extends Machine{
	@Override
	public void start() {
		System.out.println("car start");
	}
	public void changeGear() {
		System.out.println("change gear");
	}
}
