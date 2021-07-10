package by.javacource.basics.loop;

import java.util.Scanner;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {

	public static void main(String[] args) {
		
		char ch;
		
		for (int i = 1000; i<=1150; i++) {
			ch = (char)i;
			System.out.println(ch + " - " + i);
		}
	}

}
