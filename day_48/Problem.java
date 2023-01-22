package day_48;

import java.util.Scanner;

/*Day 48 coding Statement : 
 * Write Program to remove duplicate elements in an array*/
public class Problem {
	public static boolean ifnotin(int []num,int index,int x) {
		
		for(int i=0;i<=index;i++) {
			if(num[i]==x) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		int []num2=new int[n];
		int cnt=-1;
		for(int i=0;i<n;i++) {
			if(ifnotin(num2,cnt,num[i])) {
				cnt++;
				num2[cnt]=num[i];
			}
		}
		num=new int[cnt+1];
		for(int i=0;i<=cnt;i++) {
			num[i]=num2[i];
			
		}
		for(int i=0;i<=cnt;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
