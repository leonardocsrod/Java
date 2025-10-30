package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número Inteiro 01: ");
		int inteiro01 = scan.nextInt();
		
		System.out.println("Número Inteiro 02: ");
		int inteiro02 = scan.nextInt();
		
		System.out.println("Número Real: ");
		double real = scan.nextDouble();
		
		double resultA = (2 * inteiro01) * ((double) inteiro02 / 2);
		System.out.println();
		System.out.println("a: " + resultA);
		
		double resultB = (3 * inteiro01) + (real);
		System.out.println();
		System.out.println("b: " + resultB);
		
		double resultC = Math.pow(real, 3);
		System.out.println();
		System.out.println("c: " + resultC);
		
		scan.close();
	}

}
