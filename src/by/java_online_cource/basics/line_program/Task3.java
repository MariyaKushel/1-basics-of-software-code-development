package by.java_online_cource.basics.line_program;

import java.util.Scanner;
import java.math.*;

//Вычислить значение выражения по формуле (sin x + cos y) / (cos x + sin y) * tg xy 
//(все значения принимают действительнае значения).

public class Task3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Validation of input x
		double xDegree;
		System.out.print("Enter x = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("x = ");
		}
		xDegree = scan.nextDouble();

		// Validation of input y
		double yDegree;
		System.out.print("Enter y = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("y = ");
		}
		yDegree = scan.nextDouble();

		double xRadian;
		xRadian = Math.toRadians(xDegree % 360);

		double yRadian;
		yRadian = Math.toRadians(yDegree % 360);

		double xyRadian;
		xyRadian = Math.toRadians(xDegree * yDegree % 360);

		double result;
		result = (Math.sin(xRadian) + Math.cos(yRadian)) / (Math.cos(xRadian) - Math.sin(yRadian)) * Math.tan(xyRadian);

		System.out.format("%.4f%n", result);

	}

}
