package day_50;

import java.util.Scanner;

/*Day 50 coding Statement : Given an integer array of size N. Write Program to find sum of positive square elements in the array.

*/
public class Program {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=num[i]*num[i];
		}
		System.out.println(sum);
	}

}
