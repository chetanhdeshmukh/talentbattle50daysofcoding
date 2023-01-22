package day_25;

import java.util.Scanner;

/*Day 25 coding Statement : Write a program to find Area of a circle

Description

Get the value for radius from the user and calculate the area of the circle for the given radius.

Area of circle = 3.14*radius*radius*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		int r=sc.nextInt();
		sc.close();
		System.out.println("Area: "+3.14f*r*r);

	}

}
