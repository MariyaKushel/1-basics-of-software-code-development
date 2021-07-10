package by.javacource.basics.lineprogram;

import java.util.Scanner;

//Для данной области составить линейную программу, которая печает true, 
//если точка с координатами (x,y) принадлежит закрашенной области,
//и false - в противном случае. 

public class Task6 {

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

		// Validation of input y
		double y;
		System.out.print("Enter y = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter y = ");
		}
		y = scan.nextDouble();

		String answer;
		answer = (((x >= -4) && (x <= 4) && (y >= -3) && (y <= 0))
				|| ((x >= -2) && (x <= 2) && (y >= 0) && (y <= 4))) ? "true" : "false";

		System.out.print(answer);
	}

}
