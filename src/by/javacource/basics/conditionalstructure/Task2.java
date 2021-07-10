package by.javacource.basics.conditionalstructure;

import java.util.Scanner;

//Найти max{min(a,b), min(c,d)}.

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Validation of imput a
		double a;
		System.out.print("Enter a = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter a = ");
		}
		a = scan.nextDouble();

		// Validation of imput b
		double b;
		System.out.print("Enter b = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter b = ");
		}
		b = scan.nextDouble();

		// Validation of imput c
		double c;
		System.out.print("Enter c = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter c = ");
		}
		c = scan.nextDouble();

		// Validation of imput d
		double d;
		System.out.print("Enter d = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter d = ");
		}
		d = scan.nextDouble();

		double min1;
		double min2;
		double funMax;

		if (a >= b) {
			min1 = b;
		} else {
			min1 = a;
		}

		if (c >= d) {
			min2 = d;
		} else {
			min2 = c;
		}

		if (min1 >= min2) {
			funMax = min1;
		} else {
			funMax = min2;
		}

		System.out.print("Answer " + funMax);
	}

}
