package by.java_online_cource.basics.line_program;

import java.util.Scanner;

// Найти значение функции: z = ((a-3)*b/2)+c. 

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// validation of input a
		double a;
		System.out.print("Enter a = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("a = ");
		}
		a = scan.nextDouble();

		// validation of input b
		double b;
		System.out.print("Enter b = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("b = ");
		}
		b = scan.nextDouble();

		// validation of input c
		double c;
		System.out.print("Enter c = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("c = ");
		}
		c = scan.nextDouble();

		double z;
		z = ((a - 3) * b / 2) + c;
		System.out.print("z = " + z);
	}

}
