package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int maiorIdade = 0;
		int menorIdade = 0;
		
		//create vetor
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "]: ");
			vetorA[i] = scan.nextInt();
			if(i == 0) {
				maiorIdade = menorIdade = vetorA[i];
			} else {
				if(vetorA[i] > maiorIdade) {
					maiorIdade = vetorA[i];
				}
				if(vetorA[i] < menorIdade) {
					menorIdade = vetorA[i];
				}				
			}
		}
				
		scan.close();

		System.out.println("\nMaior idade: " + maiorIdade);
		System.out.println("Menor idade: " + menorIdade);
	}

}
