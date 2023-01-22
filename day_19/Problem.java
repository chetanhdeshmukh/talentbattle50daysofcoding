package day_19;

import java.util.Scanner;

/*
 * Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not
 */
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		int n=sc.nextInt();
		sc.close();
		int x=n;
		int sum=0;
		
		while(x!=0) {
			int a=x%10;
			x/=10;
			sum+=a*a*a;
		}
		if(sum==n) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
