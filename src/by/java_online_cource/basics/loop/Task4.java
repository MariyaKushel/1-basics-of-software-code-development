package by.java_online_cource.basics.loop;

import java.util.*;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {

	public static void main(String[] args) {

		long result = 1;
		int i;
		
		for (i = 1; i <= 200; i++) {

			if (result > result * (i + 1) * (i + 1)) {
				System.out.println("It`s all, can not continue");
				System.out.print("The product of squares from 1 to " + i +" is ");
				System.out.println(result);
				break;
			}

			result = result * i * i;
		}

		if (i == 201) {
			System.out.println(result);
		}

	}

}
