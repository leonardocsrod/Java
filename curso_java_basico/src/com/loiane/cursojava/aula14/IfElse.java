package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Qual a sua idade: ");
//		int idade = scan.nextInt();
//		if(idade >= 18) {
//			System.out.println("Você é maior de idade!");
//		}else {
//			System.out.println("Você é menor de idade!");
//		}

		System.out.println("Qual o preco do item: ");
		double preco = scan.nextDouble();
		
		if(preco < 10) {
			System.out.println("Está barato.");
		} else if(preco >= 10 && preco < 15) {
			System.out.println("Pode dar um desconto?");			
		} else if(preco >= 15 && preco < 17) {
			System.out.println("Vou pesquisar mais.");
		} else {
			System.out.println("Socorro, está muito caro.");
		}
	
		scan.close();
	}

}
