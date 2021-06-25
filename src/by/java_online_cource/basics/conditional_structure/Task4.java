package by.java_online_cource.basics.conditional_structure;

import java.util.Scanner;

//Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. 
//Определить, пройдет ли кирпич через отверстие.

public class Task4 {

	public static void main(String[] arg) {

		Scanner scan = new Scanner(System.in);

		// Validation of input A
		double a = 0;
		while (a <= 0) {
			System.out.print("Enter A = ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Enter A = ");
			}
			a = scan.nextDouble();
		}

		// Validation of input B
		double b = 0;
		while (b <= 0) {
			System.out.print("Enter B = ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Enter B = ");
			}
			b = scan.nextDouble();
		}

		// Validation of input x
		double x = 0;
		while (x <= 0) {
			System.out.print("Enter x = ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Enter x = ");
			}
			x = scan.nextDouble();
		}

		// Validation of input y
		double y = 0;
		while (y <= 0) {
			System.out.print("Enter y = ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Enter y = ");
			}
			y = scan.nextDouble();
		}

		// Validation of input z
		double z = -1;
		while (z <= 0) {
			System.out.print("Enter z = ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Enter z = ");
			}
			z = scan.nextDouble();
		}

		if (a < x && b < y || a < y && b < x) {
			System.out.print("The brick will go through.");
		} else if (a < x && b < z || a < z && b < x) {
			System.out.print("The brick will go through.");
		} else if (a < y && b < z || a < z && b < y) {
			System.out.print("The brick will go through.");
		} else {
			System.out.print("The brick won`t go through.");
		}

	}

}
