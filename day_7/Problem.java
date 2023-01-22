package day_7;
/*
 * Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year

Description

Get the number of month and year as input from the user and check the number of days present in that month.
 * 
 * 
 * */
import java.util.*;
public class Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Year");
		int y=sc.nextInt();
		System.out.println("Input Month");
		int m=sc.nextInt();
		int day[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		sc.close();
		if(m==2) {
			if(y%400==0&&y%100==0) {
				day[1]=29;
			}
			System.out.println("No Of Days: "+day[m-1]);
		}else {
			System.out.println("No Of Days: "+day[m-1]);
		}
		

	}

}
