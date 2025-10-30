package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[15];
		double[] numeros2 = new double[15];
		
		for(int i =0; i < numeros.length; i++) {
			System.out.print("numeros[" + (i + 1) + "]: ");
			numeros[i] = scan.nextInt();
			numeros2[i] = Math.sqrt(numeros[i]);
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%4d ", numeros[i]);
		}
		System.out.println();
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%.2f ", numeros2[i]);
		}
		
		scan.close();

	}

}
