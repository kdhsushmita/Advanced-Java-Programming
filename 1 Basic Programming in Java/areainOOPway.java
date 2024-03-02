package Labsheet;

import java.util.Scanner;
class Circle{
	public double calculateCircleArea(double radius) {
		return 3.14*radius*radius;
	}
}
class Square{
	public double calculateSquareArea(double length) {
		return length*length;
	}
}
class Rectangle{
	public double calculateRectangleArea(double width,double breadth) {
		return width*breadth;
	}
}
class Sphere{
	public double calculateSphereArea(double radius) {
		return 4*3.14*radius*radius;
	}
}
public class areainOOPway {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Select a shape to calculate area.");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Rectangle");
		System.out.println("4. Sphere");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter radius of circle");
			double radius=input.nextDouble();
			Circle c=new Circle();
			System.out.println(c.calculateCircleArea(radius));
			break;
		case 2:
			System.out.println("Enter length of square");
			double length=input.nextDouble();
			Square s=new Square();
			System.out.println(s.calculateSquareArea(length));
			break;
		case 3:
			System.out.println("Enter length of rectangle");
			double width=input.nextDouble();
			System.out.println("Enter breadth of rectangle");
			double breadth=input.nextDouble();
			Rectangle r=new Rectangle();
			System.out.println(r.calculateRectangleArea(width,breadth));
			break;
		case 4:
			System.out.println("Enter radius of the sphere");
			double sphereRadius=input.nextDouble();
			Sphere sp=new Sphere();
			System.out.println(sp.calculateSphereArea(sphereRadius));
			break;
		default:
			System.out.println("Failed");
		}
	}

}
