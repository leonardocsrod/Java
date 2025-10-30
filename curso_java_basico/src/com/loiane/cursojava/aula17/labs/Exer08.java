package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int numero;
		int soma = 0;
		double media;
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + " - Digite um número: ");
			numero = scan.nextInt();
			soma += numero;
		}
		
		
		System.out.println("A soma dos número é: " + soma);
		media = (double)soma / 5;
		System.out.println("A média dos números é: " + media);
		scan.close();

	}

}
