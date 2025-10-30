package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		int cont = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("População país A: ");
		int populacaoA = scan.nextInt();
		System.out.println("Taxa de crescimento país A");
		double txCrescA = scan.nextDouble();
		
		System.out.println("População país B: ");
		int populacaoB = scan.nextInt();
		System.out.println("Taxa de crescimento país B");
		double txCrescB = scan.nextDouble();
		
		while(populacaoA < populacaoB) {
			System.out.println("Ano " + cont + " => País A: " + populacaoA + " - País B: " + populacaoB);
			populacaoA *= (1 + txCrescA);
			populacaoB *= (1 + txCrescB);
			cont++;			
		}
		System.out.println("Ano " + cont + " => País A: " + populacaoA + " - País B: " + populacaoB);
		scan.close();
		

	}
	
	
	
	

}
