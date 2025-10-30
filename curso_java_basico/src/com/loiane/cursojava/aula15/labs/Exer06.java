package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Terceiro número: ");
		int numero3 = scan.nextInt();
		
		int maior = numero1;
		
		if(numero2 > maior) {
			maior = numero2;
		}
		if(numero3 > maior) {
			maior = numero3;
		}
		
		if(maior == numero1) {
			System.out.println("O maior número é primeiro: " + numero1);
		}
		
		if(maior == numero2) {
			System.out.println("O maior número é segundo: " + numero2);
		}
		
		if(maior == numero3) {
			System.out.println("O maior número é terceiro: " + numero3);
		}
		
		scan.close();

	}

}
