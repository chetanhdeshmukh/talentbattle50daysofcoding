package day_41;

import java.util.Scanner;

/*Day 41 coding Statement : Check if two strings match where one string contains wildcard characters

Description

Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.

Then check whether they match or not.*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string 1: ");
		String s=sc.next();
		System.out.println("Enter a string 2: ");
		String s2=sc.next();
		boolean flag=true;
		sc.close();
		if(s.length()==s2.length()) {
			for(int i=0;i<s.length();i++) {
				
				if(s.charAt(i)=='*'||s.charAt(i)=='?'||
						s.charAt(i)==s2.charAt(i)) {
					
				}else
				{
					System.out.println("Not Matched");
					flag=false;
				}
			}
		}else {
			System.out.println("Not Matched");
			flag=false;
		}
		
		if(flag) {
			System.out.println("Matched");
		}
	}

}
