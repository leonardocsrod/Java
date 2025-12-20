package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		//preenche vetorA
		System.out.println("VetorA");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}
		
		//preenche vetorB
		System.out.println();
		System.out.println("VetorB");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print("VetorB[" + i + "]: ");
			vetorB[i] = scan.nextInt();
		}	
		
		//preenche vetorC
		System.out.println();		
		for(int i = 0; i < vetorB.length; i++) {
			vetorC[i] = vetorA[i] % vetorB[i];
		}
		
		//imprime vetorA
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorA = {");
				System.out.print(vetorA[i] + ", ");
			} else if(i > 0  && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.print(vetorA[i]);
				System.out.print("}");
				
			}
	}
		
		//imprime vetorB
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorB = {");
				System.out.print(vetorB[i] + ", ");
			} else if(i > 0  && i < vetorA.length - 1) {
				System.out.print(vetorB[i] + ", ");
			} else {
				System.out.print(vetorB[i]);
				System.out.print("}");
					
			}
		}

		//imprime vetorB
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorC = {");
				System.out.print(vetorC[i] + ", ");
			} else if(i > 0  && i < vetorA.length - 1) {
				System.out.print(vetorC[i] + ", ");
			} else {
				System.out.print(vetorC[i]);
				System.out.print("}");
							
			}
		}
		
	scan.close();

}
}
