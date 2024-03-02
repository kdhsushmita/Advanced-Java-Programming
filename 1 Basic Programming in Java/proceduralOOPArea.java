package Labsheet;

import java.util.Scanner;

public class proceduralOOPArea {
	public double calculateCircleArea(double radius) {
		return 3.14*radius*radius;
	}
	public double calculateSquareArea(double length) {
		return length*length;
	}
	public double calculateRectangleArea(double width,double breadth) {
		return width*breadth;
	}
	public double calculateSphereArea(double radius) {
		return 4*3.14*radius*radius;
	}
	public static void main(String[] args)
	{
		proceduralOOPArea obj=new proceduralOOPArea();
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
			System.out.println(obj.calculateCircleArea(radius));
			break;
		case 2:
			System.out.println("Enter length of square");
			double length=input.nextDouble();
			System.out.println(obj.calculateSquareArea(length));
			break;
		case 3:
			System.out.println("Enter length of rectangle");
			double width=input.nextDouble();
			System.out.println("Enter breadth of rectangle");
			double breadth=input.nextDouble();
			System.out.println(obj.calculateRectangleArea(width,breadth));
			break;
		case 4:
			System.out.println("Enter radius of the sphere");
			double sphereRadius=input.nextDouble();
			System.out.println(obj.calculateSquareArea(sphereRadius));
			break;
		default:
			System.out.println("Failed");
		}
	}

}
