package day_45;

import java.util.Scanner;

/*Day 45 coding Statement : 
 Write Program to find smallest and largest element in an array*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("SIZE OF ARRAY: ");
		int a=sc.nextInt();
		int s=Integer.MAX_VALUE;
		int l=Integer.MIN_VALUE;
		
		int [] num=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter Element "+(i+1)+" for Array:");
			num[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<a;i++) {
			if(num[i]<s) {
				s=num[i];
			}else if(num[i]>l) {
				l=num[i];
			}
		}
		
		System.out.println("Largest: "+l);
		System.out.println("Smallest: "+s);
		
		

	}

}
