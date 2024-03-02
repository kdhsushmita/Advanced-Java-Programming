package Labsheet;

import java.util.Scanner;

public class add2nostatic {
	public int addTwoNumbers(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		add2nostatic num=new add2nostatic();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a");
		int a=scn.nextInt();
		System.out.println("Enter b");
		int b=scn.nextInt();
		System.out.println("After adding two numbers :"+num.addTwoNumbers(a,b));
	}

}
