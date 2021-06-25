package by.java_online_cource.basics.loop;

import java.util.Scanner;

//Вычислить значение функции на отрезке [a,b] с шагом h.
//y = x, x > 2;
//y = -x, x <= 2.

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Validation of input a
		double a;
		System.out.print("Enter a = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter a = ");
		}
		a = scan.nextDouble();

		// Validation of input b
		double b;
		b = a;
		while (b <= a) {
			System.out.print("Enter b = ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Enter b = ");
			}
			b = scan.nextDouble();
		}

		// Validation of input h
		double h = 0;
		while (h <= 0) {
			System.out.print("Enter h = ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Enter h = ");
			}
			h = scan.nextDouble();
		}

		double fun = 0;

		do {
			if (a > 2) {
				fun = a;
				System.out.println("If x = " + a + "; y = " + fun);
			} else {
				fun = -a;
				System.out.println("If x = " + a + "; y = " + fun);
			}
			a = a + h;
		} while (a <= b);

	}

}
