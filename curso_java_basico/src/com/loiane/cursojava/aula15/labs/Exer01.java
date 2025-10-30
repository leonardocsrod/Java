package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro número: ");
		int numero01 = scan.nextInt();
		
		System.out.println("Segundo número: ");
		int numero02 = scan.nextInt();
		
		if(numero01 > numero02) {
			System.out.println("O primeiro número é o maior: " + numero01);
		} else {
			System.out.println("O segundo número é o maior: " + numero02);
		}
		
		scan.close();

	}

}
