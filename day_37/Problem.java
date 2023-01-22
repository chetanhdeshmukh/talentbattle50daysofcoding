package day_37;

import java.util.Scanner;

/*Day 37 coding Statement : Write a Program to calculate the 
 * Frequency of characters in a string
 * Note: only alphabetical characters considered
 * */
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("INPUT: ");
		String s=sc.nextLine();
		int n[]=new int[123];
		sc.close();
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')) {
				n[s.charAt(i)]++;
			}
		}
		for(int i=65;i<123;i++) {
			if(n[i]>0) {
				System.out.println("The Frequency of "+(char)i+" is "+n[i]);
			}
		}
	}

}
