package day_29;

import java.util.Scanner;

/*Day 29 coding Statement : Write a Program to concatenate a string.

Description

Get two strings as input from the user and then concatenate it.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first string: ");
		String s1=sc.next();
		System.out.println("Enter second string: ");
		String s2=sc.next();
		sc.close();
		System.out.println("Concatenated String: "+s1+s2);
	}

}
