package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digit the value for hour: ");
		double valueOfHour = scan.nextDouble();
		System.out.println("Enter the quantity of hours in the month: ");
		double quantityOfHours = scan.nextDouble();
		double salary = quantityOfHours * valueOfHour;
		System.out.println("The value of the salary in the month is: " + salary);
	}

}
