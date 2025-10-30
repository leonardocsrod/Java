package com.loiane.cursojava.aula17.labs;

public class Exer04 {
	public static void main(String[] args) {
		int cont = 0;
		int populacaoA = 80000;
		double txCrescA = 1.03;
		int populacaoB = 200000;
		double txCrescB = 1.015;
		while(populacaoA < populacaoB) {
			populacaoA *= txCrescA;
			populacaoB *= txCrescB;
			cont++;		
			System.out.println("A: " + populacaoA + " - B: " + populacaoB);
		}
		System.out.println("Anos para A ultrapassar B: " + cont);
		System.out.println("População pais A: " + populacaoA);
		System.out.println("População pais B: " + populacaoB);

		
	}
}
