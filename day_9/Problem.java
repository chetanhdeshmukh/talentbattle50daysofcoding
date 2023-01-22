package day_9;
/*Day 9 coding Statement : Write a program to find Number of digits in an integer*/
import java.util.Scanner;
public class Problem {
//Note: considered zero digits in no 0
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int x=sc.nextInt();
		sc.close();
		int cnt=0;
		
		while(x!=0) {
			cnt++;
			x/=10;
		}
		System.out.println("No Of Digits: "+cnt);
	
	}

}
