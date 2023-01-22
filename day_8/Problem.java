package day_8;
/*Day 8 coding Statement:  Write a program to find roots of a quadratic equation

Description

Get the values of a, b and c (coefficients of quadratic equation) as input from the user 
and calculate the roots and print as the output.*/
import java.util.Scanner;
import java.lang.Math;

public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		int a=sc.nextInt();
		System.out.println("Enter B:");
		int b=sc.nextInt();
		System.out.println("Enter C:");
		int c=sc.nextInt();
		sc.close();
		double b2_4ac=(b*b)-4*a*c;
		if(b2_4ac==0) {
			System.out.println("Equal Roots: "+ -b/(2*a));
		}if(b2_4ac>0) {
			System.out.println("Has 2 real Roots:");
			System.out.println("Root 1:"+((-b)+Math.sqrt(b2_4ac))/(2*a));
			System.out.println("Root 2:"+((-b)-Math.sqrt(b2_4ac))/(2*a));
		}if(b2_4ac<0) {
			System.out.println("Has 2 Complex Roots:");
			System.out.println("Root 1:"+(-b)/(2*a)+"+"+Math.sqrt(b2_4ac*(-1))/(2*a)+"i");
			System.out.println("Root 2:"+(-b)/(2*a)+"-"+Math.sqrt(b2_4ac*(-1))/(2*a)+"i");
		}

	}

}
