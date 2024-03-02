package Labsheet;

public class areaperimeterRectangle {
	private int length;
	private int breadth;
	public areaperimeterRectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public int calculateArea() {
		return length*breadth;
	}
	public int calculatePerimeter() {
		return 2*(length+breadth);
	}
	public static void main(String[] args) {
		areaperimeterRectangle r = new areaperimeterRectangle(10,20);
		System.out.println("Area of rectangle "+r.calculateArea());
		System.out.println("Perimeter of rectangle "+r.calculatePerimeter());
	}

}
