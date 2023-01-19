package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double raio;
		double area;
		System.out.println("Digit the value of raio[cm]: ");
		raio = scan.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("The area of the circle is " + area + " cm2.");
		

	}

}
