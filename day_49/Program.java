package day_49;

import java.util.Scanner;

/*
 Day 49 coding Statement : Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.

Sample input 1 :

4

1 2 3 4

5 6 7 8

Sample output 1 :

60

Explanation :

(4*5 + 3*6 + 2*7 + 1*8) = 60

Sample input 2 :

4

-1 -2 -3 -4

5 6 -7 -8

Sample output 2 :

-17

Explanation :

(-1*-8 + -2*-7 + -3*6 + -4*5) = -17 
 
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of arrays: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array 1");
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of array 2");
		int []num2=new int[n];
		for(int i=0;i<n;i++) {
			num2[i]=sc.nextInt();
		}
		sc.close();
		int sum=0;
		for (int i=0,j=n-1;i<n;i++,j--) {
			sum+=(num[i]*num2[j]);
			
		}
		System.out.println(sum);
		
	}

}
