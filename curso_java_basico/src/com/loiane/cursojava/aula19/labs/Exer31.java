package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int contPar = 0;
		int contImpar = 0;
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		//print vetorA
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("VetorA = {" + vetorA[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.print(vetorA[i] + "}");
			}
		}		
		
		//create vetorB par
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[contPar] = vetorA[i];
				contPar++;
			}
		}

		contImpar = contPar;

		//create vetorB impar
		for(int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i] % 2 != 0) {
				vetorB[contImpar] = vetorA[i];
				contImpar++;
			}
		}


		
		//print vetorB
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("VetorB = {" + vetorB[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorB[i] + ", ");
			} else {
				System.out.print(vetorB[i] + "}");
			}
		}
		
		scan.close();

	}

}
