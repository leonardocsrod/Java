package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		int numero = scan.nextInt();
		
		if(numero > 0) {
			System.out.println("O número é positivo.");
		} else if(numero < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é zero.");
		}
		
		scan.close();

	}

}
