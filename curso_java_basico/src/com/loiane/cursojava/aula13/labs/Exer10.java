package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Temperatura em Celsius: ");
		double tCelsius = scan.nextDouble();
		
		double tFarenheit = ((9 / 5) * tCelsius) + 32;
		System.out.println("Temperatura em Farenheit: " +tFarenheit );
		
		scan.close();

	}

}
