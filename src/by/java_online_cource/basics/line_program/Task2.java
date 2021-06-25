package by.java_online_cource.basics.line_program;

import java.util.Scanner;
import java.math.*;

// Вычислить значение выражения по формуле (все значения принимают действительнае значения).

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Validation of input a
		double a;
		System.out.print("Enter a = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("a = ");
		}
		a = scan.nextDouble();

		// Validation of input b
		double b;
		System.out.print("Enter b = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("b = ");
		}
		b = scan.nextDouble();

		// Validation of input c
		double c;
		System.out.print("Enter c = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("c = ");
		}
		c = scan.nextDouble();

		double result;
		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.print("The result is " + result);

	}

}
