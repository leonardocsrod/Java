package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		int fatorial = 1;
				
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		//create vetorB
		for(int i = 0; i < vetorA.length; i++) {
			for(int j = 1; j <= vetorA[i]; j++) {
				fatorial *= j;
			}
			vetorB[i] = fatorial;
			fatorial = 1;
			
		}
		
		scan.close();

		//print vetorA
		System.out.print("VetorA = {");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("}");
		
		//print vetorB
		System.out.print("VetorB = {");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println("}");
	}

}
