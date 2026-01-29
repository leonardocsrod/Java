package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[20];
		double cotacao = 5.5;
		
		//create vetor
		for(int i = 1; i <= vetorA.length; i++) {
			vetorA[i - 1] = i * cotacao;
		}
		
		//print vetor
		for(int i = 0; i < vetorA.length; i++) {
			if(i == 0) {
				System.out.print("VetorA = {" + vetorA[i] + ", ");
			} else if(i > 0 && i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.print(vetorA[i] + "}\n");
			}
		}
		
		scan.close();

	}

}
