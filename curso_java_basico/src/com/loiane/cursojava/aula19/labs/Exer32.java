package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		//create tables
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			for(int j = 0; j <= 10; j++) {
				System.out.println(vetorA[i] + " * " + j + " = " + vetorA[i] * j);
			}
			System.out.println();
		}
		
		scan.close();

	}

}
