package day_15;

import java.util.Scanner;

/*Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.*/
public class Problem {
	public static int fact(int n) {
		int cnt=n-1;
		while(cnt>1) {
			n*=cnt;
			cnt--;
		}
		return n;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		int n=sc.nextInt();
		sc.close();
		int k=n;
		int sum=0;
		while(n!=0) {
			sum+=fact(n%10);
			n/=10;
		}
		if(sum==k) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}
		
		
	}

}
