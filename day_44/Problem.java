package day_44;

import java.util.Scanner;

/*
 Day 44 coding Statement : 
 Write Program to find number of even and odd elements in an array
*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("SIZE OF ARRAY: ");
		int a=sc.nextInt();
		int [] num=new int[a];
		int even=0;
		int odd=0;
		
		
		for(int i=0;i<a;i++) {
			System.out.println("Enter Element "+(i+1)+" for Array:");
			num[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<a;i++) {
			if(num[i]==0) {
				continue;
			}
					if(num[i]%2==0) {
						even++;
					}else {
						odd++;
					}
					
		}
		
		System.out.println("Even: "+even);
		System.out.println("Odd: "+odd);
		
	}

}
