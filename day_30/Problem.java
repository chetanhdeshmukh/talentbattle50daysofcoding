package day_30;

import java.util.Scanner;

/*Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		String s=sc.next();
		sc.close();
		int i=0;
		char []ch=s.toCharArray();
		for(char x:ch) {
			i++;
		}
		System.out.println("Length: "+i);
	}

}
