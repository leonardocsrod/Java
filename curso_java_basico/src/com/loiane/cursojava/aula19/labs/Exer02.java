package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros= new int[8];
		int[] numeros2 = new int[8];
		//recebe itens array
		for(int i = 0; i < 8; i++ ) {
			System.out.print("numero [" + (i + 1) + "]: ");
			numeros[i] = scan.nextInt();
		}
		
		//imprime itens array
		System.out.print("numeros = { ");
		for(int i = 0; i < 8; i++ ) {
			System.out.print(numeros[i] + " ");			
		}
		System.out.print("}");
		
		//cria itens array2
		for(int i = 0; i < 8; i++ ) {
			numeros2[i] = numeros[i] * 2;
		}
		
		//imprime itens array2
		System.out.println();
		System.out.print("numeros = { ");
		for(int i = 0; i < 8; i++ ) {
			System.out.print(numeros2[i] + " ");			
		}
		System.out.print("}");
		
		scan.close();
	}

}
