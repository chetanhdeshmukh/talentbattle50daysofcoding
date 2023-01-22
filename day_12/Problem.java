package day_12;
/*Day 12 coding Statement:  Write a program to find Sum of digits of a number*/
import java.util.*;
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		
		while(n!=0) {
			sum+=(n%10);
			n/=10;
		}
		System.out.println("Sum is: " +sum);
	}

}
