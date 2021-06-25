package by.java_online_cource.basics.line_program;

import java.util.Scanner;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННчММминSSс.

public class Task5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Validation of input t
		int time = -1;
		while (time <= 0) {
			System.out.print("Enter time in seconds ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print("Enter time in seconds ");
			}
			time = scan.nextInt();
		}

		int timeSec;
		timeSec = time % 60;
		
		int timeMin;
		timeMin = (time - time % 60) / 60 % 60;
		
		int timeНours;
		timeНours = (time - time % 60) / 60 / 60;

		System.out.format("Time %dh %02dmin %02dsec", timeНours, timeMin, timeSec);

	}

}
