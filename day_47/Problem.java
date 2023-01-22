package day_47;

import java.util.Arrays;
import java.util.Scanner;

//Day 47 coding Statement : 
//Write Program to find longest palindrome in an array
public class Problem {
	public static boolean ispalindrome(int x) {
		int n=x;
		int m=0;
		while(n!=0) {
			m=m*10+(n%10);
			n/=10;
		}
		if(m==x) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		int index=-1;
		for(int i=n-1;i>=0;i--) {
			if(ispalindrome(num[i])) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("Palidrome not found");
		}else {
			System.out.println("Longest Palindrome: "+num[index]);
		}
		sc.close();

	}

}
