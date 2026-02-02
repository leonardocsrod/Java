package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}

		//create vetorB
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorB[" + i + "] = ");
			vetorB[i] = scan.nextInt();
		}
		
		//create vetorC
		for(int i = 0; i < vetorC.length; i++) {
			if(i >=0 && i <= 9) {
				vetorC[i] = vetorA[i];				
			} else {
				vetorC[i] = vetorB[i - 10];
			}
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

		//print vetorC
		System.out.println();
		for(int i = 0; i < vetorC.length; i++) {
			if(i == 0) {
				System.out.print("VetorC = {" + vetorC[i] + ", ");
			} else if(i > 0 && i < vetorC.length - 1) {
				System.out.print(vetorC[i] + ", ");
			} else {
				System.out.print(vetorC[i] + "}");
			}
		}
		
		
		
		scan.close();

	}

}
