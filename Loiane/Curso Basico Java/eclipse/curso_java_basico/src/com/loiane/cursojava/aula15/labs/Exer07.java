package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		System.out.println("Enter the third number");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Bigger number is " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Bigger number is " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("Bigger number is " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("Smaller number is " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Smaller number is " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Smaller number is " + num3);
		}
		
	}

}
