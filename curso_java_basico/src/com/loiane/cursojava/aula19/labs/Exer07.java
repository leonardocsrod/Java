package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		//cria vetor a
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + (i + 1) + "]: ");
			a[i] = scan.nextInt();
		}
		
		//cria vetor b e c
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			System.out.print("b[" + (i + 1) + "]: ");
			b[i] = scan.nextInt();
			c[i] = a[i] - b[i];
		}		

		//imprime vetor a
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[" + (i + 1) + "]: %d ", a[i]);
			
		}				

//imprime vetor b
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			System.out.printf("b[" + (i + 1) + "]: %d ", b[i]);
				
		}

//imprime vetor c
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			System.out.printf("c[" + (i + 1) + "]: %d ", c[i]);
			
		}	
		
		
		scan.close();

	}

}
