package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		//create vetor
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 != 0) {
				break;
			}
		}
		
		scan.close();

	}

}
