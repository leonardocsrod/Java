package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		String[] vetorB = new String[vetorA.length];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		//create vetorB
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] < 7) {
				vetorB[i] = "a";
			} else if(vetorA[i] == 7) {
				vetorB[i] = "b";
			} else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = "c";
			} else if(vetorA[i] == 10) {
				vetorB[i] = "d";
			} else {
				vetorB[i] = "e";
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
		

	}

}
