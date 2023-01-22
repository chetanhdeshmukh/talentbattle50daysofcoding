package day_5;
/*
 Day 5 coding Statement:  Write a program to identify if the number is even or odd

 */
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No: ");
	int n=sc.nextInt();
	sc.close();
	if(n%2==0) {
		System.out.println("Even");
	}else {
		System.out.println("Odd");
	}

	}

}
