package com.loiane.cursojava.aula12;

import java.util.Scanner;
public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Muito prazer, " + nomeCompleto + ".");
		
		System.out.println("Digite seu primeiro nome: ");
		String nome = scan.next();
		System.out.println("Muito prazer, " + nome + ".");
		
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é : " + idade);
		
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		*/
		
		System.out.println("Digite seu primeiro nome, sua idade e sua altura: ");
		String nome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		System.out.println("Seu nome é " + nome + ", voce tem " + idade + " anos, e mede " + altura + "metros.");
	}

}
