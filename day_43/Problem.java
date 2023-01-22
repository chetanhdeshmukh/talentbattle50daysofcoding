package day_43;

import java.util.Scanner;

/*
 Day 43 coding Statement : Write Program to find the array type

Description

Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

Input

Enter size of array :

3

Enter elements 

1 3 5

Output

Odd 
 */
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("SIZE OF ARRAY 1: ");
		int a=sc.nextInt();
		int [] num1=new int[a];
		boolean even=false;
		boolean odd=false;
		
		
		for(int i=0;i<a;i++) {
			System.out.println("Enter Element "+(i+1)+" for Array 1:");
			num1[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<a;i++) {
			if(num1[i]==0) {
				continue;
			}
					if(num1[i]%2==0) {
						even=true;
					}else {
						odd=true;
					}
					if(odd&&even) {
						break;
					}
		}
		
		if(odd&&even) {
			System.out.println("Mixture of Both");
		}else if(even) {
			System.out.println("Even");
		}else if (odd) {
			System.out.println("Odd");
		}
		

	}

}
