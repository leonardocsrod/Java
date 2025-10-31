package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] numeros2 = new int[10];
		int[] numeros3 = new int[10];
		
		System.out.println("Vetor numeros");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("numeros[" + (i + 1) + "]: ");
			numeros[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("Vetor numeros2");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("numeros2[" + (i + 1) + "]: ");
			numeros2[i] = scan.nextInt();
			numeros3[i] = numeros[i] + numeros2[i];
		}
		
		System.out.println();
		//imprime vetor numeros
		for(int i = 0; i < numeros.length; i++) {
			if(i == 0) {
				System.out.print("numeros = {");
				System.out.printf("%3d, ", numeros[i]);
			} else if(i > 0 && i < numeros.length - 1) {
				System.out.printf("%3d, ", numeros[i]);
			} else {
				System.out.printf("%3d", numeros[i]);
				System.out.println("}");
			}
		}
		
		//imprime vetor numeros2
			for(int i = 0; i < numeros.length; i++) {
				if(i == 0) {
					System.out.print("numeros = {");
					System.out.printf("%3d, ", numeros2[i]);
				} else if(i > 0 && i < numeros.length - 1) {
					System.out.printf("%3d, ", numeros2[i]);
				} else {
					System.out.printf("%3d", numeros2[i]);
					System.out.println("}");
				}
			}
			
			//imprime vetor numeros3
			for(int i = 0; i < numeros.length; i++) {
				if(i == 0) {
					System.out.print("numeros = {");
					System.out.printf("%3d, ", numeros3[i]);
				} else if(i > 0 && i < numeros.length - 1) {
					System.out.printf("%3d, ", numeros3[i]);
				} else {
					System.out.printf("%3d", numeros3[i]);
					System.out.println("}");
				}
			}
			
		scan.close();

	}

}
