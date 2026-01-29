package com.loiane.cursojava.aula19.labs;

public class Exer22 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int soma1 = 0;
		int soma0 = 0;
		
		//create vetor
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random());
			if(vetorA[i] == 0) {
				soma0++;
			} else {
				soma1++;
			}
		}
		
		double percentagem0 = (double)soma0/10;
		double percentagem1 = (double)soma1/10;
		//print vetor
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
		System.out.printf("Percentagem 0: %.2f\n", percentagem0);
		System.out.printf("Percentagem 1: %.2f", percentagem1);

	}

}
