package day_11;
/*Day 11 coding Statement:  Write a program to find Fibonacci series up to n*/
import java.util.Scanner;
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int n=sc.nextInt();
		sc.close();
		int prev=0;
		int crt=1;
		if(n==1) {
			System.out.print("0");
		}else {
			System.out.print("0,1");
		}
		
		for(int i=2;i<n;i++){
			int nxt=prev+crt;
			System.out.print(","+nxt);
			prev=crt;
			crt=nxt;
		}
		
		
	}

}
