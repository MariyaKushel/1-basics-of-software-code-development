package by.java_online_cource.basics.conditional_structure;

import java.util.Scanner;

//Даны два угла треугольника (в градусах).
//Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Validation of input first corner
		double firstCorner;
		System.out.print("Enter first corner ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter first corner ");
		}
		firstCorner = scan.nextDouble();

		// Validation of input second corner
		double secondCorner;
		System.out.print("Enter second corner ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter srcond corner ");
		}
		secondCorner = scan.nextDouble();

		if ((firstCorner + secondCorner) < 180 && firstCorner > 0 && secondCorner > 0) {
			System.out.print("Such a triangle exists. ");
			if ((firstCorner + secondCorner) == 90) {
				System.out.print("It is a right triangle.");
			}
		} else {
			System.out.print("Such a triangle does not exist.");
		}
	}

}
