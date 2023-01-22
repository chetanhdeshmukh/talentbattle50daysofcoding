package day_34;

import java.util.Scanner;

/*Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression

Description

Get an algebraic expression as input from the user and then remove all the brackets in that.

Input

7x+(2*y)

Output

7x+2*y
*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.next();
		String s2="";
		sc.close();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='('&&s.charAt(i)!=')') {
				s2=s2+s.charAt(i);
				
			}
		}
		System.out.println(s2);

	}

}
