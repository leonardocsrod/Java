package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		
		System.out.println("Lado 1: ");
		lado1 = scan.nextDouble();

		System.out.println("Lado 2: ");
		lado2 = scan.nextDouble();

		System.out.println("Lado 3: ");
		lado3 = scan.nextDouble();
		
		if((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <= lado1) {
			System.out.println("Os lados não formam um triângulo.");
		} else if (lado1 == lado2 && lado2 == lado3){
			System.out.println("Os lados formam um triângulo equilátero.");
		} else if ((lado1 == lado2 && lado2 != lado3) ||(lado1 == lado3 && lado2 != lado3)){
			System.out.println("Os lados formam um triângulo isósceles.");
		} else if (lado1 != lado2 && lado2 != lado3){
			System.out.println("Os lados formam um triângulo escaleno.");
		} 
		
		scan.close();

	}

}
