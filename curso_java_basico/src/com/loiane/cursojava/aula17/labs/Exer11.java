package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Número inicial: ");
		int numeroInicial = scan.nextInt();
		System.out.println("Número final: ");
		int numeroFinal = scan.nextInt();
		for(int i = numeroInicial; i <=numeroFinal; i++) {
			System.out.println("i: " + i);
			soma += i;
		}
		System.out.println("A soma dos números é: " + soma);
		
		scan.close();

	}

}
