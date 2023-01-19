package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double meter, result;
		System.out.println("Digit the meter: ");
		meter = scan.nextDouble();
		result = meter * 100;
		System.out.println(meter + " meters are " + result + " centimeters");
		

	}

}
