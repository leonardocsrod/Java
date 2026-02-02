package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int cont = 0;
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		//print result
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			cont = 0;
			for(int j = 1; j <= vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					cont++;
				}
			}
			if(cont <= 2) {
				System.out.println("O número " + vetorA[i] + " é primo.");
			} else {
				System.out.println("O número " + vetorA[i] + " não é primo.");
			}
			
		}
		
		scan.close();

	}

}
