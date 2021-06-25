package by.java_online_cource.basics.line_program;

import java.util.Scanner;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
// Поменять местами дробную и целую части числа и вывести полученное значение числа.  

public class Task4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Validation of input r
		float r = 1;
		while (r >= 1000 || r <= 100 || (r * 10) % 1 == 0 || (r * 100) % 100 == 0 || (r * 1000) % 1 != 0) {
			System.out.print("Enter R of the form nnn,ddd ");
			while (!scan.hasNextFloat()) {
				scan.next();
				System.out.print("Enter R of the form nnn,ddd ");
			}
			r = scan.nextFloat();
		}

		float firstPartOfNumber;
		firstPartOfNumber = r * 1000 % 1000;
		
		float secondPartOfNumber;
		secondPartOfNumber = (r - r % 1) / 1000;
		
		float magicNumber;
		magicNumber = firstPartOfNumber + secondPartOfNumber;

		System.out.print("New R = " + magicNumber);

	}

}
