package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetora = new int[10];
		int[] vetorb = new int[vetora.length];
		
		//fill vetora
		for(int i = 0; i < vetora.length; i++) {
			System.out.print("vetora[" + i + "] = ");
			vetora[i] = scan.nextInt();
		}
		
		//fill vetorb
		for(int i = 0; i < vetorb.length; i++) {
			vetorb[i] = vetora[i] * i;
		}
		
		//print vetora
		for(int i = 0; i < vetora.length; i++) {
			if(i == 0) {
				System.out.print("vetora = {");
				System.out.print(vetora[i] + ", ");
			} else if(i > 0  && i < vetora.length - 1) {
				System.out.print(vetora[i] + ", ");
			} else {
				System.out.print(vetora[i] + "}");
			}
			
		}
		
		System.out.println();
		//print vetorb
				for(int i = 0; i < vetora.length; i++) {
					if(i == 0) {
						System.out.print("vetorb = {");
						System.out.print(vetorb[i] + ", ");
					} else if(i > 0  && i < vetora.length - 1) {
						System.out.print(vetorb[i] + ", ");
					} else {
						System.out.print(vetorb[i] + "}");
					}
					
				}
		
		scan.close();
		
	}

}
