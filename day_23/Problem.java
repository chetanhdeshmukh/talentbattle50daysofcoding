package day_23;

import java.util.Scanner;

/*Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		int num=sc.nextInt();
		String num2="";
		sc.close();
		while(num!=0) {
			int x=num%10;
			num/=10;
			if(x==0) {
				x=1;
			}
			num2=x+num2;
		}
		System.out.println("Output: "+num2);

	}

}
