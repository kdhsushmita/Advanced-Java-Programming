package Labsheet;

public class Encapsulation {
	private int age;
	private String name;
	public Encapsulation(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation(1, "Sushmita");
		int resultAge = e.getAge();
		String name = e.getName();
		System.out.println(resultAge);
		System.out.println(name);
	
	}

}
