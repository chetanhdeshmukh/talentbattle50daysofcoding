package day_17;
/*Day 17 coding Statement : Write a program to find the Factors of a number

Description

Get an input from the user and find the factors of the number.*/
import java.util.Scanner;
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT: ");
		int x=sc.nextInt();
		sc.close();
		System.out.print("1");
		for(int i=2;i<=x;i++) {
			if(x%i==0) {
				System.out.print(", "+i);
			}
		}

	}

}
