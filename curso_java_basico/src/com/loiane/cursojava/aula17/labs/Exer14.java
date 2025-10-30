package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		int contpar = 0;
		int contImpar = 0;
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Número " + (i + 1) + ": ") ;
			numero = scan.nextInt();
			if(numero % 2 == 0) {
				contpar++;
			} else {
				contImpar++;
			}
			
		}
		System.out.println("Quantidade par: " + contpar);
		System.out.println("Quantidade impar: " + contImpar);
		
		scan.close();
	}

}
