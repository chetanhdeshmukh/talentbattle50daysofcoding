package day_3;
//Day 3 coding Statement: 
//Write a program to find ASCII values of a character

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		sc.close();
		System.out.println((int)a);
	}

}
