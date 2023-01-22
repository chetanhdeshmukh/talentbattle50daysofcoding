package day_6;

/*
 * Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie

Get the value of x and y coordinates as input from 
the user and check in which quadrant the point lies and print it.
 * 
 * */
import java.util.*;

public class Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X:");
		int x = sc.nextInt();
		System.out.println("Enter Y:");
		int y = sc.nextInt();
		sc.close();
		if (x > 0 && y > 0) {
			System.out.println("I");
		} else if (x < 0 && y > 0) {
			System.out.println("II");
		} else if (x < 0 && y < 0) {
			System.out.println("III");
		} else if (x > 0 && y < 0) {
			System.out.println("IV");
		} else if (x == 0 && y == 0) {
			System.out.println("At Origin");
		} else if (x == 0) {
			System.out.println("On Y Axis");
		} else if (y == 0) {
			System.out.println("On X Axis");
		}

	}

}
