package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota bimestre 1: ");
		double nota1 = scan.nextInt();
		System.out.println("Nota bimestre 2: ");
		double nota2 = scan.nextInt();
		System.out.println("Nota bimestre 3: ");
		double nota3 = scan.nextInt();
		System.out.println("Nota bimestre 4: ");
		double nota4 = scan.nextInt();
		
		double media;
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média das notas é: " + media);
		scan.close();

	}

}
