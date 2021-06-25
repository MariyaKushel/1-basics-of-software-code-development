package by.java_online_cource.basics.loop;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. 
//А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Validation of input number
		long number = 0;
		while (number <= 0) {
			System.out.print("Enter number ");
			while (!scan.hasNextLong()) {
				scan.next();
				System.out.print("Enter number ");
			}
			number = scan.nextLong();
		}

		long index = 1;
		long sum = 0;

		while (index < number) {
			sum = sum + index;
			index++;
		}

		System.out.print("The sum is " + sum);
	}

}
