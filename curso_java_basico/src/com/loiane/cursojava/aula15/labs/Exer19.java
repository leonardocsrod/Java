package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resultado = 0;
		System.out.println("Informe um número: ");
		int numero1 = scan.nextInt();
		System.out.println("Operação[+-*/]: ");
		String operacao = scan.next();
		System.out.println("Informe o outro número: ");
		int numero2 = scan.nextInt();
		
		if(operacao.equalsIgnoreCase("+")) {
			resultado = numero1 + numero2;
		} else if(operacao.equalsIgnoreCase("-")) {
			resultado = numero1 - numero2;
		} else if(operacao.equalsIgnoreCase("*")) {
			resultado = numero1 * numero2;
		} else if(operacao.equalsIgnoreCase("/")) {
			resultado = numero1 / numero2;
		}
		
		System.out.println("O resultado da operação " + operacao + " entre os números " + numero1 + " e " 
				+ numero2 + " é " + resultado);
		if(resultado % 2 == 0) {
			System.out.println("O número " + resultado + " é par.");
		} else {
			System.out.println("O número " + resultado + " é impar.");
		}
		
		if(resultado >= 0) {
			System.out.println("O número " + resultado + " é positivo");
		} else {
			System.out.println("O número " + resultado + " é negativo.");
		}
		
		
		
		scan.close();

	}

}
