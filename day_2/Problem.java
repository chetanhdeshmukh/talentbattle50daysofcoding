package day_2;

import java.util.Scanner;

//Write a program to identify if the character is an alphabet or not.
public class Problem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		sc.close();
		if((ch<='z'&&ch>='a')||(ch<='Z'&&ch>='A')){
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not an alphabet");
		}
	}

}
