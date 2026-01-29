package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = true;
		
		//create vetor
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();			
		}
		
		//verifica vetor
		for(int i = 0; i < (vetorA.length / 2); i++) {
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
			}
		}
		
		if(palindromo == true) {
			System.out.println("O vetor é um palíndromo");
		} else {
			System.out.println("O vetor não é um palíndromo");
		}
		
		
		scan.close();

	}

}
