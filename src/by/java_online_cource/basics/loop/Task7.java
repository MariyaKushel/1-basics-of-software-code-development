package by.java_online_cource.basics.loop;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители,
//кроме еденицы и самого числа. m и n вводятся с клавиатуры.

public class Task7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Validation of input m
		int m = 0;
		while (m <= 0) {
			System.out.print("Enter m = ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print("Enter m = ");
			}
			m = scan.nextInt();
		}

		// Validation of input n
		int n;
		n = m;
		while (n <= m) {
			System.out.print("Enter n = ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print("Enter n = ");
			}
			n = scan.nextInt();
		}

		if ((n - m) > 1) {
			for (int number = m + 1; number < n; number++) {

				System.out.print(number + " : ");

				int i = 2;
				boolean flag = true;

				while (number > i) {
					if (number % i == 0) {
						System.out.print(i + "; ");
						flag = false;
					}
					i++;
				}

				if (flag) {
					System.out.print("it haven`t any dividers, except 1 and " + number);
				}

				System.out.println("");
			}
		} else {
			System.out.println("There aren`t natural numbers in the interval");
		}

	}

}
