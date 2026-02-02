package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		//create vetorA, vetorB and VetorC
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
			} else {
				vetorC[i] = vetorA[i];
			}
		}
		
		//print vetorA
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("VetorA = {" + vetorB[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.print(vetorA[i] + "}");
			}
		}
		
		//print vetorB
		System.out.println();
		System.out.print("VetorB = {");
		
		for(int i = 0; i < vetorA.length; i++) {			
			if(vetorB[i] != 0) {
				if(i == vetorA.length - 1) {
					System.out.print(vetorB[i]);
				} else {
					System.out.print(vetorB[i] + ", ");
				}
		}
		}
		System.out.print("}");

		//print vetorC
		System.out.println();
		System.out.print("VetorC = {");
		
		for(int i = 0; i < vetorA.length; i++) {			
			if(vetorC[i] != 0) {
				if(i == vetorA.length - 1) {
					System.out.print(vetorC[i]);
				} else {
					System.out.print(vetorC[i] + ", ");
				}
				
			} 
		}
		System.out.print("}");
		
		scan.close();
		
		
		
		

	}

}
