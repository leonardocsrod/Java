package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		double dobroArea = area * 2;
		
		System.out.println("A área do quadrado com lado "+ lado + " centímetros é de " + area + " centímetros, e o seu dobro é " + dobroArea  + " centímetros.");
		
		
		
		scan.close();

	}

}
