package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int somaMult = 0;
		
		//fill vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("vetorA[" + i + "]: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 5 == 0) {
				System.out.println("valor múltiplo de 5");
				somaMult += vetorA[i];
			}
		}
		
		//print vetorA
		System.out.println("\n");
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("vetorA = {");
				System.out.print(vetorA[i] + ", ");
			} else if(i > 0  && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.print(vetorA[i] + "}\n");
			}
		}
		System.out.println("A soma dos valores múltiplos de 5 é " + somaMult);
		scan.close();

	}

}
