package by.javacource.basics.conditionalstructure;

import java.util.Scanner;

//Даны три точки A(x1,y1), B(x2,y2) и C(x3,y3). 
//Определить, будут ли они расположены на одной прямой.

public class Task3 {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);

		// Validation of input x1
		double x1;
		System.out.print("Enter x1 = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter x1 = ");
		}
		x1 = scan.nextDouble();

		// Validation of input y1
		double y1;
		System.out.print("Enter y1 = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter y1 = ");
		}
		y1 = scan.nextDouble();

		// Validation of input x2
		double x2;
		System.out.print("Enter x2 = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter x2 = ");
		}
		x2 = scan.nextDouble();

		// Validation of input y2
		double y2;
		System.out.print("Enter y2 = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter y2 = ");
		}
		y2 = scan.nextDouble();

		// Validation of input x3
		double x3;
		System.out.print("Enter x3 = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter x3 = ");
		}
		x3 = scan.nextDouble();

		// Validation of input y3
		double y3;
		System.out.print("Enter y3 = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter y3 = ");
		}
		y3 = scan.nextDouble();

		if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3) 
				|| (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.print("Points lie on one straight line.");
		} else {
			System.out.print("Points DON`T lie on one straight line.");
		}
	}

}
