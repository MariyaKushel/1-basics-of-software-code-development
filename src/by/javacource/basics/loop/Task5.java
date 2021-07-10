package by.javacource.basics.loop;

import java.util.Scanner;
import java.math.*;

//Даны числовой ряд и некоторе число e.
//Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
//Общий члена ряда имеет вид:
//an = 1/2^n + 1/3^n

public class Task5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Validation of input e
		double e;
		System.out.print("Enter e = ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter e = ");
		}
		e = scan.nextDouble();

		int i = 1;
		double sum = 0;
		// Don`t need to use absolute value of a number, because all of members of series are positive
		double a;
		a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

		if (e <= 0) {
			// sum (1/2^n+1/3^n) = sum 1/2^n + sum 1/3^n, because series converges
			// sum 1/2^n = (1/2)/(1-(1/2)) = 1
			// sum 1/3^n = (1/3)/(1-(1/3)) = 1/2
			// sum (1/2^n+1/3^n) = 1+(1/2) = 3/2 = 1,5
			sum = 1.5;
			System.out.print("The sum is " + sum);

		} else if (e <= a) {
			while (e <= a) {
				sum = sum + a;
				i++;
				a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			}
			System.out.print("The sum is " + sum);
		} else {
			System.out.print("e more that any member of series.");
		}
	}

}
