package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		//fill vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "]: ");
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
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
				System.out.print(vetorA[i] + "}");
			}
		}
		
		System.out.println("\n");
		System.out.println("A soma dos valores do vetorA é " + soma);
		scan.close();

	}

}
