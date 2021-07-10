package by.javacource.basics.loop;

import java.util.Scanner;

//Найти сумму квадратов первых ста чисел.

public class Task3 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum = sum + i * i;
		}

		System.out.print("The sum is " + sum);

	}

}
