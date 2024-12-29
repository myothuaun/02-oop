package myy14.getter_and_setter;

public class Student {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<10) {
			System.out.println("you are young");
			
		}else {
			System.out.println("you are adult");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
