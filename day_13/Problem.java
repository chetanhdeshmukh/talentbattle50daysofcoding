package day_13;
/*Day 13 coding Statement:  Write a program to find Sum of N natural numbers*/
import java.util.*;
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		while(n!=0) {
			sum+=n;
			n--;
		}
		System.out.println("Sum is : "+  sum);

	}

}
