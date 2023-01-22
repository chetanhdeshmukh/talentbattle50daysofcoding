package day_20;

import java.util.Scanner;

/*Day 20 coding Statement : Write a program to identify if the number is Prime number or not

*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n= sc.nextInt();
		sc.close();
		boolean flag=true;
		if(n==1) {
			flag=false;
			System.out.println("Not a Prime Number");
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not a Prime Number");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Prime Number");
		}

	}

}
