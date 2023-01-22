package day_21;

import java.util.Scanner;

/*Day 21 coding Statement : Write a program to identify if the number is Palindrome or not*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		int num=sc.nextInt();
		sc.close();
		int x=num;
		int rev=0;
		while(x!=0) {
			rev=rev*10+(x%10);
			x/=10;
		}
		if(num==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");

		}
		
		
	}

}
