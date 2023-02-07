package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNumber = scan.nextInt();
		if (firstNumber < 0) {
			System.out.println("The number " + firstNumber + " is negative!");
		} else {
			System.out.println("The number " + firstNumber + " is positive!");
		}

	}

}
