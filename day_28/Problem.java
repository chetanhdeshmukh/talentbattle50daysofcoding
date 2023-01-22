package day_28;

import java.util.Scanner;

/*Day 28 coding Statement : Write a Program to reverse a string.

Description

Get an input string from user and print it in reverse order.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		String l=sc.next();
		sc.close();
		for (int i=l.length()-1;i>=0;i--) {
			System.out.print(l.charAt(i));
		}
	}

}
