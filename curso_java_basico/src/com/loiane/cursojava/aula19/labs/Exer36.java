package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[11];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.pow(2, i);			
		}
		
		//print vetorA
		System.out.print("VetorA = {");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("}");
		scan.close();

	}

}
