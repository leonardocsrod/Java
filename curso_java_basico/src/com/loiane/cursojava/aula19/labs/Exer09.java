package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		//fill vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println();
		//fill vetorB
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorB[" + i + "] = ");
			vetorB[i] = scan.nextInt();
		}
		
		System.out.println();
		//fill vetorC
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.println();
		//print vetorA
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorA = {");
				System.out.print(vetorA[i] + ", ");
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
				System.out.print("vetorB = {");
				System.out.print(vetorB[i] + ", ");
			} else if(i > 0 && i < vetorB.length - 1) {
				System.out.print(vetorB[i] + ", ");
			} else {
				System.out.print(vetorB[i] + "}");
			}
		}
		
		System.out.println();
		//print vetorC
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorC = {");
				System.out.print(vetorC[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorC[i] + ", ");
			} else {
				System.out.print(vetorC[i] + "}");
			}
		}
		

		scan.close();
	}

}
