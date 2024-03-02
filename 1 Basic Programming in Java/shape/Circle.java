package shape;

public class Circle {
	public int radius;
	public Circle(int radius) {
		this.radius=radius;
		}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
class Square {
	public int length;
	public Square(int length)
	{
		this.length=length;
	}
	public int getArea() {
		return length*length;
	}

}

