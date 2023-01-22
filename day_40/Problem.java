package day_40;

import java.util.Scanner;

/*Day 40 coding Statement : Write a Program to Replace substring in a string

Description

Get a string as input from the user and then get another string which has to be removed from the string.

Get the third input, the new substring which is placed in that substring position.

Finally print the output by replacing the substring with new string.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string: ");
		String s=sc.next();
		System.out.println("Enter the substring to be removed: ");
		String srem=sc.next();
		System.out.println("Enter the new substring : ");
		String snew=sc.next();
		s=s.replace(srem, snew);
		System.out.println(s);
		sc.close();
	}

}
