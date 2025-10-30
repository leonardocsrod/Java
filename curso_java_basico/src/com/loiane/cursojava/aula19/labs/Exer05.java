package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] numeros2 = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("numeros[" + (i + 1) + "]: ");
			numeros[i] = scan.nextInt();
			numeros2[i] = numeros[i] * i;
		}
		
		System.out.println();
		
		for(int i = 0; i < numeros.length; i++) {
			if(i == 0) {
				System.out.print("numeros  = {");
				System.out.printf("%2d, ", numeros[i]);
			} else if(i > 0 && i < (numeros.length - 1)) {
				System.out.printf("%2d, ", numeros[i]);
			} else {
				System.out.printf("%2d", numeros[i]);
				System.out.println("}");
			}
			
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if(i == 0) {
				System.out.print("numeros2 = {");
				System.out.printf("%2d, ", numeros2[i]);
			} else if(i > 0 && i < (numeros.length - 1)) {
				System.out.printf("%2d, ", numeros2[i]);
			} else {
				System.out.printf("%2d", numeros2[i]);
				System.out.println("}");
			}
			
		}
		scan.close();

	}

}
