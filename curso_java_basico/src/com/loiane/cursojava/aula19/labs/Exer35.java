package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println();
			System.out.println("VetorA[" + i + "] = " + vetorA[i]);
			for(int j = 1; j <= vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					System.out.println(j + " é divisor de " + vetorA[i]);
				}
			}
		}
		scan.close();

	}

}
