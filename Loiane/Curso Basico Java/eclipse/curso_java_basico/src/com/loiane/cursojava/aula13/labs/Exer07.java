package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double side;
		System.out.println("Enter the side of the square: ");
		side = scan.nextDouble();
		double squareArea = Math.pow(side, 2);
		double result = squareArea * 2;
		System.out.println("The result is " + result + ".");
		
	}

}
