package day_36;

import java.util.Scanner;

/*Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string

Description

Get a string from the user and then change the first and last letter to uppercase.

Input

programming

Output

ProgramminG
*/
public class Problem {
	public static void cap(int n,String s,String s2) {
		if(s.charAt(n)>='a'&&s.charAt(n)<='z') {
			System.out.print((char)(s.charAt(n)-32));
		}else {
			System.out.print(s.charAt(n));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.nextLine();
		String s2="";
		sc.close();
		cap(0,s,s2);
		
		for(int i=1;i<s.length()-1;i++) {
			if(s.charAt(i-1)==' '||s.charAt(i+1)==' '||i==0||i==s.length()-1) {
				cap(i,s,s2);
	
			}else {
				System.out.print(s.charAt(i));
			}
			
		}
		cap(s.length()-1,s,s2);
		
		
	}

}
