package day_18;

import java.util.Scanner;

/*Day 18 coding Statement : Write a program to Add two fractions

Description

Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)
*/
public class Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input X1:");
		int x1 = sc.nextInt();
		System.out.println("Input Y1:");
		int y1 = sc.nextInt();
		System.out.println("Input X2:");
		int x2 = sc.nextInt();
		System.out.println("Input Y2:");
		int y2 = sc.nextInt();
		sc.close();
		int x3, y3;
		x3 = (x1 * y2) + (x2 * y1);
		y3 = (y1 * y2);

		int x;
		if (y3 < x3) {
			x = y3;
		} else {
			x = x3;
		}
		for (int i = x; i > 1; i--) {
			if (y3 % i == 0 && x3 % i == 0) {
				y3 /= i;
				x3 /= i;
			}
		}

		System.out.println("Output: " + x3 + "/" + y3);

	}

}
