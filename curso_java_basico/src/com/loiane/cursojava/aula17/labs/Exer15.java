package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		int numero3 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro termo: ");
		int numero1 = scan.nextInt();
		System.out.println("Segundo termo: ");
		int numero2 = scan.nextInt();
		System.out.println("Termo: ");
		int termo = scan.nextInt();
		
		System.out.print(numero1 + " ");
		System.out.print(numero2 + " ");
		numero3 = numero1 + numero2;
		for(int i = 0; i <= (termo - 3); i++) {					
			System.out.print(numero3 + " ");	
			numero1 = numero2;
			numero2 = numero3;
			numero3 = numero1 + numero2;
		}
		
		//1,  1, 2, 3, 5, 8, 13, 21, 34, 55
		//n1 n2 n3 
		scan.close();

	}

}
