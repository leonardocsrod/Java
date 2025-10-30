package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Temperatura em Farenheit: ");
		double tFarenheit = scan.nextDouble();
		
		double tCelsius = (5 * (tFarenheit - 32) / 9);
		System.out.println("Temperatura em Farenheit: " + tFarenheit);
		System.out.println("Temperatura em Celsius: " + tCelsius);
		
		scan.close();

	}

}
