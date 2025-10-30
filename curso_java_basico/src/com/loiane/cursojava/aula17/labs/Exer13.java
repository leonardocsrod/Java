package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		int resultado = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Base: ");
		int base = scan.nextInt();
		System.out.print("Expoente: ");
		int expoente = scan.nextInt();
		
		for(int i = 0; i < expoente; i++) {
			resultado *= base;
			System.out.println("Resultado: " + resultado);
		}
		
		scan.close();

	}

}
