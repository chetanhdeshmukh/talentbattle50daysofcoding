package day_39;

import java.util.Scanner;

/*Day 39 coding Statement : Write a Program to check if two strings are Anagram or not

Description

Get two strings as input from the user and check whether it is Anagram or not.(Anagram-Reverse of each other)
Input

sunlight thgiluns

Output

Anagram
*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT STRING 1: ");
		String s=sc.next();
		System.out.println("INPUT STRING 2: ");
		String s2=sc.next();
		sc.close();
		String s3="";
		for (int i=s.length()-1;i>=0;i--) {
			s3+=s.charAt(i);
		}
		if(s2.equals(s3)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}

	}

}
