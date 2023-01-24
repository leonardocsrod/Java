package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature[F]: ");
		double farenheitTemperature = scan.nextDouble();
		double celsiusTemperature = 5 * ((farenheitTemperature - 32) / 9);
		System.out.println("The temperature in celsius is: " + celsiusTemperature);
		
	}

}
