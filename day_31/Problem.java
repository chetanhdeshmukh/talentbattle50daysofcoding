package day_31;

import java.util.Scanner;

/*Day 31 coding Statement : Write a Program to Toggle each character in a string

Description

Get an input string from user and then convert the lower case of alphabets
 to upper case and all upper-case alphabets into lower case.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.next();
		String s2="";
		sc.close();
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65&&s.charAt(i)<=122) {
				if(s.charAt(i)>=65&&s.charAt(i)<=90) {
					s2=s2+""+(char)((int)(s.charAt(i))+32);
					
				}else {
					s2=s2+""+(char)((int)(s.charAt(i))-32);
				}
				
				
			}else {
				s2=s2+s.charAt(i);
			}
			
		}
			System.out.println("Output: "+s2);
	}

}
