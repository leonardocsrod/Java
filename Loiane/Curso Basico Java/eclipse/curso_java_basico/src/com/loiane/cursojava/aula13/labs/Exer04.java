package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double grade1, grade2, grade3, grade4, average;
		System.out.println("Digit all the grades: ");
		grade1 = scan.nextDouble();
		grade2 = scan.nextDouble();
		grade3 = scan.nextDouble();
		grade4 = scan.nextDouble();
		average = (grade1 + grade2 + grade3 + grade4) / 4;
		System.out.println("The average is " + average + ".");
		
		
	}
	
}
