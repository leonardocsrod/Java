package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the celsius temperature: ");
		double celsiusTemperature = scan.nextDouble();
		double farenheitTemperature = (9 * celsiusTemperature + 160) / 5;
		System.out.println("The farenheit temperature is " + farenheitTemperature + "F");
		
		
	}

}
