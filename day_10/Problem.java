package day_10;
import java.util.Scanner;
/*Day 10 coding Statement:  Write a program to find Factorial of a number*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int x=sc.nextInt();
		sc.close();
		int cnt=x-1;
		while(cnt>1) {
			x*=cnt;
			cnt--;
		}
		System.out.println("Factorial: "+x);
	}

}
