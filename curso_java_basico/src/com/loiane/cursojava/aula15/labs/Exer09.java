package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menor, meio, maior;
		
		System.out.println("Primeiro número: ");
		int numero1 = scan.nextInt();
		meio = numero1;
		menor = numero1;
		maior = numero1;
		
		System.out.println("Segundo número: ");
		int numero2 = scan.nextInt();	
		
		System.out.println("Terceiro número: ");
		int numero3 = scan.nextInt();
		
		if(numero2 < menor) {
			menor = numero2;
		}
		if(numero2 > maior) {
			maior = numero2;
		}
		if((numero2 > numero3 && numero2 < numero1) || (numero2 > numero1 && numero2 < numero3)) {
			meio = numero2;
		}		
		
		if(numero3 < menor) {
			menor = numero3;
		}
		if(numero3 > maior) {
			maior = numero3;
		}
		if((numero3 > numero1 && numero2 < numero2) || (numero3 > numero2 && numero2 < numero1)) {
			meio = numero2;
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Meio: " + meio);
		System.out.println("Menor: " + menor);
		
		
		scan.close();
	}

}

