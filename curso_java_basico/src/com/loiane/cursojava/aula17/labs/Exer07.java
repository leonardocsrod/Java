package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int maior = 0;
		int numero;
		do {
			System.out.println(i + " - Digite um número: ");
			numero = scan.nextInt();
			if(numero > maior) {
				maior = numero;
			}
			i++;
		}while(i < 5);
		System.out.println("O maior número digitado foi: " + maior);
			
		
		
		scan.close();
	}

}
