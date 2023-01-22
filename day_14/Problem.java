package day_14;

import java.util.Scanner;

/*Day 14 coding Statement : Write a program to reverse a given number*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int n=sc.nextInt();
		sc.close();
		int rev=0;
		while(n!=0) {
			rev=rev*10+(n%10);
			n/=10;
		}
		System.out.println("Reversed Integer: "+rev);
	}

}
