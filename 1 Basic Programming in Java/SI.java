package Labsheet;

import java.util.Scanner;

public class SI {
	public float interestCalculator(int P,int T,float R) {
		return (P*R*T)/100;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Principle");
		int P=scn.nextInt();
		System.out.println("Enter Time");
		int T=scn.nextInt();
		System.out.println("Enter Rate");
		float R=scn.nextFloat();
		SI s=new SI();
		System.out.println("Simple Interest is "+s.interestCalculator(P, T, R));
		
	}

}
