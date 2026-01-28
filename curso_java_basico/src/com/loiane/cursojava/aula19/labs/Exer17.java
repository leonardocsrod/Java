package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma35plus = 0;
				
		//create vetor
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Vetor[" + i + "]: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] > 35) {
				soma35plus++;
			}
		}
		
		//print vetor
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("VetorA[" + i + "]: " + vetorA[i] + ", ");
			} else if(i > 0 && i < (vetorA.length - 1)) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.print(vetorA[i] + "}");
			}
			
		}
		System.out.println("\nA quantidade de pessoas com idade maior que 38 é: " + soma35plus);
		scan.close();
				
				

	}

}
