package day_32;

import java.util.Scanner;

//Day 32 coding Statement : Write a Program to Remove vowels from a string
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.next();
		String s2="";
		sc.close();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				continue;
			}else {
				s2=s2+s.charAt(i);
			}
			
			
		}
		System.out.println("Output: "+s2);
		
	}

}
