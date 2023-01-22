package day_4;
//Day 4 coding Statement: 
//Write a program to identify of the a number is positive or negative
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n<0) {
			System.out.println("Negative number");
		}else if(n>0) {
			System.out.println("Positive number");
		}else {
			System.out.println("Neither positive nor negative");
		}
		
	}

}
