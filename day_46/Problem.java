package day_46;

import java.util.Scanner;

/*Day 46 coding Statement :
 Write Program to find sum of elements in an array*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("SIZE OF ARRAY: ");
		int a=sc.nextInt();
		int [] num=new int[a];
		int sum=0;
		
		for(int i=0;i<a;i++) {
			System.out.println("Enter Element "+(i+1)+" for Array:");
			num[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<a;i++) {
			sum+=num[i];
		}
		
		System.out.println("Sum: "+sum);
	}

}
