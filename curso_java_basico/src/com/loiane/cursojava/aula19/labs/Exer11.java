package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int qtdePar = 0;
		
		//fill vetorA
		System.out.println("VetorA");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "]: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				qtdePar++;
			}
		}
		
		//print vetorA
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorA = {");
				System.out.print(vetorA[i] + ", ");
			} else if(i > 0  && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.println(vetorA[i] + "}");
			}
		}
		
		
		scan.close();
		System.out.println("Quantidade de elementos pares: " + qtdePar);

	}

}
