package day_16;

import java.util.Scanner;

/*Day 16 coding Statement : Write a program to identify if the number is Perfect number or not

Description

Get the input from the user and check whether that number is a perfect number or not.

E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a Perfect Number");
		}
	}

}
