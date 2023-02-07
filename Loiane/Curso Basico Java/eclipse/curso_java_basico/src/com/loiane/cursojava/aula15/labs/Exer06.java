package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Enter the first number: ");
		int biggerNumber = scan.nextInt();
		System.out.println("Enter the second number: ");
		int secondNumber = scan.nextInt();
		if (secondNumber > biggerNumber) {
			biggerNumber = secondNumber;
		}
		System.out.println("Enter the third number: ");
		int thirdNumber = scan.nextInt();
		if (thirdNumber > biggerNumber) {
			biggerNumber = thirdNumber;
		}
		*/
		System.out.println("Enter the first number: ");
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		int secondNumber = scan.nextInt();
		
		System.out.println("Enter the third number: ");
		int thirdNumber = scan.nextInt();
		
		if(firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			System.out.println("The bigger number is " + firstNumber);
		} else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
			System.out.println("The bigger number is " + secondNumber);
		} else {
			System.out.println("The bigger number is " + thirdNumber);
		}
			
		
		

	}

}
