package day_42;

import java.util.Arrays;
import java.util.Scanner;

//Day 42 coding Statement : 
//Write Program to check if two arrays are the same or not
//
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("SIZE OF ARRAY 1: ");
		int a=sc.nextInt();
		System.out.println("SIZE OF ARRAY 2: ");
		int b=sc.nextInt();
		int [] num1=new int[a];
		int [] num2=new int [b];
		for(int i=0;i<a;i++) {
			System.out.println("Enter Element "+(i+1)+" for Array 1:");
			num1[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++) {
			System.out.println("Enter Element "+(i+1)+" for Array 2:");
			num2[i]=sc.nextInt();
		}
		
		boolean flag=true;
		if(a==b) {
			Arrays.sort(num1);
			Arrays.sort(num2);
			for(int i=0;i<b;i++) {
				if(num1[i]!=num2[i]) {
					//
					flag=false;
					break;	
				}
			}
		}else {
			flag=false;
		}
		if(flag) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
		

		
		
		sc.close();
	}

}
