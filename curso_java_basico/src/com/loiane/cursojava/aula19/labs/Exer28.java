package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		//create vetorB
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[vetorA.length - i - 1];
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
				System.out.print("VetorA = {" + vetorB[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorB[i] + ", ");
			} else {
				System.out.print(vetorB[i] + "}");
			}
		}
		scan.close();

	}

}
