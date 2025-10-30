package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		int maior, menor;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		maior = menor = numero1;
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		int numero3 = scan.nextInt();
		
		if(numero2 > maior) {
			maior = numero2;
		}
		if(numero3 > maior) {
			maior = numero3;
		}
		
		if(numero2 < menor) {
			menor = numero2;
		}
		if(numero3 < menor) {
			menor = numero3;
		}
		
		if(maior == numero1) {
			System.out.println("O maior número é o primeiro: " + numero1);
		}else if(maior == numero2) {
			System.out.println("O maior número é o segundo: " + numero2);
		}else if(maior == numero3) {
			System.out.println("O maior número é o terceiro: " + numero3);
		}
		
		if(menor == numero1) {
			System.out.println("O menor número é o primeiro: " + numero1);
		}else if(menor == numero2) {
			System.out.println("O menor número é o segundo: " + numero2);
		}else if(menor == numero3) {
			System.out.println("O menor número é o terceiro: " + numero3);
		}
				
		scan.close();
	}

}
