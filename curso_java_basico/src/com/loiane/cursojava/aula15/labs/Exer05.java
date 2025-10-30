package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		int nota1 = scan.nextInt();
		
		System.out.println("Segunda nota: ");
		int nota2 = scan.nextInt();
		
		double media = (nota1 + nota2) / 2;
		if(media == 10) {
			System.out.println("Aprovado com distinção.");
		} else if(media >= 7) {
			System.out.println("Aprovado.");
		} else if(media >= 0 && media < 7){
			System.out.println("Reprovado");
		} else {
			System.out.println("Média inválida");
		}
		scan.close();

	}

}
