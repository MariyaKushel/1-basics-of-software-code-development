package by.javacource.basics.conditionalstructure;

import java.util.Scanner;
import java.math.*;

//Вычислить значение функции. 
//F(x) = x^2-3x+9, если x<=3;
//F(x) = 1/(x^3+6), если x>3.

public class Task5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Validation of input x
		double x;
		System.out.print("Enter x = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter x = ");
		}
		x = scan.nextDouble();

		double fun;

		if (x <= 3) {
			fun = Math.pow(x, 2) - 3 * x + 9;
		} else {
			fun = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.print("Answer " + fun);
	}

}
