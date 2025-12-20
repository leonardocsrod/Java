package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		float contaImpar = 0;
		float soma = 0;
		float media = 0;
		
		//fill vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "]: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				contaImpar++;
			}
		}
		
		//print vetorA
		System.out.println("\n");
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorA = {" + vetorA[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.println(vetorA[i] +"}\n");
			}
		}
		
		media = soma / contaImpar;
		System.out.println("A média aritmética dos números ímpares do");
		System.out.printf("vetorA é %.2f", media);
		scan.close();

	}

}
