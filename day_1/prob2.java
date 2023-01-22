package day_1;
//Day 1 coding Statement: 
//Write a program to identify if the character is a vowel or consonant.
import java.util.Scanner;
public class prob2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		sc.close();
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
		{
			System.out.println("Vowel");
		}else if((ch<='z'&&ch>='a')||(ch<='Z'&&ch>='A')){
			System.out.println("Consonant");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
