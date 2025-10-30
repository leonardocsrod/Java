package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Medida do raio do circulo: ");
		double raio = scan.nextDouble();
		
		double pi = Math.PI;
		double area = pi * Math.pow(raio, 2);
		
		System.out.println("A área do circulo com raio de " + " centimetros é igual a " + area + "." );
		
		scan.close();
		

	}

}
