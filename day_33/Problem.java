package day_33;

import java.util.Scanner;

//Day 33 coding Statement : Write a Program to check if String is a palindrome or not
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.next();
		sc.close();
		boolean flag=true;
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("Not a Palindrome");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}
	}

}
