package day_35;

import java.util.Scanner;

/*Day 35 coding Statement : Write a Program to Count the sum of numbers in a string

Description

Get a string from the user and find the sum of numbers in the string.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.next();
		int sum=0;
		sc.close();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)<=57&&s.charAt(i)>48) {
					sum+=s.charAt(i)-48;
				}
			}
			System.out.println(sum);
	}

}
