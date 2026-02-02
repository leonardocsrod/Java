package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		//create vetorA
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("VetorA[" + i + "] = ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[" + i + "] = " + vetorA[i]);
			for(int j = 0; j <= vetorA[i]; j += 2) {				
				if(j <= vetorA[i]) {
					System.out.println(j);
				}
			}
		}
		
	
		scan.close();

	}

}
