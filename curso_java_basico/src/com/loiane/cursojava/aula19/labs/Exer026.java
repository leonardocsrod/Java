package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "]= ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println();
		//create vetorB
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorB[" + i + "]= ");
			vetorB[i] = scan.nextInt();
		}

		//create vetorC
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
			
		}
		scan.close();
		
		System.out.println();
		//print vetorA
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

		System.out.println();
		//print vetorC
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("VetorC = {" + vetorC[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorC[i] + ", ");
			} else {
				System.out.print(vetorC[i] + "}");
			}
		}

		

	}

}
