package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[15];
		int[] numeros2 = new int[15];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("numeros[" + (i + 1) +"]: ");
			numeros[i] = scan.nextInt();
			numeros2[i] = numeros[i] * numeros[i];			
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%3d ",numeros[i]);
		}
		
		System.out.println();
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%3d ", numeros2[i]);
		}
		
		scan.close();
	}

}
