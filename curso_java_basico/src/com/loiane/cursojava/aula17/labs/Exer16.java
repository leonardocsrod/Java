package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Primeiro termo: ");
		int numero1 = scan.nextInt();
		System.out.print("Segundo termo: ");
		int numero2 = scan.nextInt();
		int numero3 = numero1 + numero2;
		
		System.out.println(numero1 + " ");
		System.out.println(numero2 + " ");
		do {
			System.out.println(numero3 + " ");
			numero1 = numero2;
			numero2 = numero3;
			numero3 = numero1 + numero2;
		} while(numero3 < 500);
		
		scan.close();

	}

}
