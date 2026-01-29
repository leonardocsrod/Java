package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		//create vetor
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}
		}
		
		// print vetorA
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("VetorA = {" + vetorA[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.print(vetorA[i] + "}");
			}
		}
		System.out.println();
		//print vetorB
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
