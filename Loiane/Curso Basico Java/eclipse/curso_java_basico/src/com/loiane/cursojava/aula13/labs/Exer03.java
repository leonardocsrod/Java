package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digit the first number[0-100]: ");
		int number1 = scan.nextInt();
		System.out.println("Digit tne second number[0-100]: ");
		int number2 = scan.nextInt();
		int sum = number1 + number2;
		System.out.println("The sum between " + number1 + " and " + number2 + " is " + sum + ".");		
		

	}

}
