package day_22;
/*Day 22 coding Statement : 
 Write a program to express a number as a
  sum of two prime numbers

Description

Get a number as input from the user and express that
 number as sum of two prime numbers.*/
import java.util.*;
public class Problem {
	public static boolean isprime(int n) {
		for(int i=2;i<Math.sqrt(n);i++) {
			if (n%i==0) {
				return false;
			}
		}
		if (n<2) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		int n=sc.nextInt();
		sc.close();
		boolean flag=true;
		outer:
		for(int i=2;i<n;i++) {
			if(isprime(i)) {
				for(int j=n-2;j>1;j--) {
					if(isprime(j)&&i+j==n) {
						System.out.println("Prime Pair: "+i+" & "+j);
						flag=false;
						break outer;
					}
				}
			}
		}
		if(flag) {
			System.out.println("Prime pair not Available");
		}
		

	}

}
