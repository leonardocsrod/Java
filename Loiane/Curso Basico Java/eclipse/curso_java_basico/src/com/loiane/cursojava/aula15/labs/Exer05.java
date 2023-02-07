package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first grade: ");
		double grade1 = scan.nextDouble();
		System.out.println("Enter the second grade: ");
		double grade2 = scan.nextDouble();
		double gradeAverage = (grade1 + grade2) / 2;
		if(gradeAverage == 10) {
			System.out.println("Approved with honnor!");
		} else if(gradeAverage >= 7) {
			System.out.println("Approved!");
		} else {
			System.out.println("Failed!");			
		} 
		

	}

}
