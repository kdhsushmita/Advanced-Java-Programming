package Labsheet;
interface Animal {
	 void makeSound();
}
class Dog implements Animal {
	 public void makeSound() {
	 System.out.println("Bark bark");
	}
}
class Cat implements Animal {
	 public void makeSound() {
	 System.out.println("Meow");
	}
}
public class PolymorphismInterface {
	public static void main(String[] args) {
		 Animal animal1 = new Dog();
		 Animal animal2 = new Cat();
		 animal1.makeSound();
		 animal2.makeSound(); 
}}
