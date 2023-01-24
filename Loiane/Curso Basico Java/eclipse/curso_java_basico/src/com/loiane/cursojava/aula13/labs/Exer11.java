package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the firt number[int]: ");
		int intNumber1 = scan.nextInt();
		System.out.println("Enter the second number[int]: ");
		int intNumber2 = scan.nextInt();
		System.out.println("Enter the third number[real]: ");
		double doubleNumber = scan.nextDouble();
		double result1 = (2 * intNumber1) * (intNumber2 / 2);
		double result2 = (3 * intNumber1) + doubleNumber;
		double result3 = Math.pow(doubleNumber, 3);
		System.out.println("a: " + result1);
		System.out.println("b: " + result2);
		System.out.println("c: " + result3);
		

	}

}
