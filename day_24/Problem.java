package day_24;

import java.util.Scanner;

/*Day 24 coding Statement : Write a program to print Pyramid pattern using stars

Description

Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		int x=sc.nextInt();
		sc.close();
		
		
		for(int i=1;i<=x;i++) {
			for(int j=x;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
			
		}
		
		

	}

}
