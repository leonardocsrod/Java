package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter the second number: ");
		int secondNumber = scan.nextInt();
		if (firstNumber > secondNumber) {
			System.out.println("The bigger number is " + firstNumber);
		} else {
			System.out.println("The bigger number is " + secondNumber);
		}

	}

}
