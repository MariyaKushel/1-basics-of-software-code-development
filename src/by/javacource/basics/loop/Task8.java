package by.javacource.basics.loop;

import java.util.Scanner;
import java.math.*;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Validation of input first number
		int firstNumber;
		System.out.print("Enter first number ");
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Enter first number ");
		}
		firstNumber = scan.nextInt();
		firstNumber = Math.abs(firstNumber);

		// Validation of input second number
		int secondNumber;
		System.out.print("Enter second number ");
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Enter second number ");
		}
		secondNumber = scan.nextInt();
		secondNumber = Math.abs(secondNumber);

		
		// Make the smallest number first. It isn`t necessary,
		// but I suppose, it is an interesting method.
		if (firstNumber > secondNumber) {
			secondNumber = secondNumber + firstNumber;
			firstNumber = secondNumber - firstNumber;
			secondNumber = secondNumber - firstNumber;
		}

		
		int tempFirst;
		int tempSecond;
		boolean flag = true;

		for (int i = 0; i < 10; i++) {
			tempFirst = firstNumber;
			
			do {
				if (tempFirst % 10 == i) {
					
					tempSecond = secondNumber;
					do {
						if (tempSecond % 10 == i) {
							System.out.print(i + "  ");
							flag = false;
							tempSecond = 0;
						}
						tempSecond = tempSecond / 10;
					} while (tempSecond > 0);

					tempFirst = 0;
				}
				tempFirst = tempFirst / 10;
			} while (tempFirst > 0);

		}
		
		if (flag) { 
			 System.out.print("No matches."); 
			 }

		
		/*
		 * //Another solution to the task. But it isn`t perfect.
		 * 
		 * int temp; 
		 * boolean flag = true;
		 * 
		 * do { 
		 * 		temp = secondNumber;
		 * 
		 * 		do { 
		 * 			if (firstNumber % 10 == temp % 10) { 
		 * 			System.out.print(firstNumber % 10 + "   "); 
		 * 			flag = false; 
		 * 			temp = 0; 
		 * 			} 
		 * 			temp = temp / 10; 
		 * 		} while (temp > 0);
		 * 
		 * 		firstNumber = firstNumber / 10;
		 * 
		 * } while (firstNumber > 0);
		 * 
		 * if (flag) { 
		 * 	System.out.print("No matches."); 
		 * }
		 */

	}

}
