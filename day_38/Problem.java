package day_38;

import java.util.Scanner;

/*
 Day 38 coding Statement : Write a Program to print Non-repeating characters in a string

Description

Get a string as the input from the user and print the non-repeating characters in a string.
 */
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.nextLine();
		int n[]=new int[123];
		sc.close();
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')) {
				n[s.charAt(i)]++;
			}
		}
		for(int i=0;i<s.length();i++) {
			if(n[s.charAt(i)]==1) {
				System.out.print(s.charAt(i));
			}
		}
		
	}

}
