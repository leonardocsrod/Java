package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		float contaPar = 0;
		float contaImpar = 0;
		float percentPar = 0;
		float percentImpar = 0;
		
		//fill vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "]: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				contaPar++;
			} else {
				contaImpar++;
			}
		}
		
		//print vetorA
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("\nvetorA = {" + vetorA[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.println(vetorA[i] + "}\n");
			}
		}
		
		percentPar = contaPar / 10 * 100;
		percentImpar = 100 - percentPar;
		
		System.out.println("O percentual de números pares é de " + percentPar + "%.");
		System.out.println("O percentual de números ímpares é de " + percentImpar + "%.");
		
		
		scan.close();

	}

}
