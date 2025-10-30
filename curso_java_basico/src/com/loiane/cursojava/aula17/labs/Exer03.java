package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = "";
		String genero = "";
		String estadoCivil = "";
		int idade = 0;
		double salario = 0;
		do {
			System.out.print("Nome[>3]: ");
			nome = scan.next();
			if(nome.length() < 3) {
				System.out.println("O nome deve ter mais de três caracteres.");
			}
		} while(nome.length() < 3);
		
		System.out.println();
		do {
			System.out.print("Idade[0-150]: ");
			idade = scan.nextInt();
			if(idade <= 0 || idade >= 150) {
				System.out.println("A idade deve ser maior que zero e menor que 150 anos.");
			}
		} while(idade <= 0 || idade >= 150);
		
		System.out.println();
		do {
			System.out.print("Salário[>0]: ");
			salario = scan.nextDouble();
			if(salario <= 0) {
				System.out.println("O salário deve ser maior que zero.");
			}
		}while(salario <= 0);
		
		System.out.println();
		do {
			System.out.println("Gênero[m/f]: ");
			genero = scan.next();
		} while(!genero.equalsIgnoreCase("m") && !genero.equalsIgnoreCase("f"));
		
		System.out.println();
		do {
			System.out.println("Estado civil[s/c/v/d]: ");
			estadoCivil = scan.next();			
		} while(!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("s") && !estadoCivil.equals("v") && !estadoCivil.equals("d") );
		
		scan.close();

		System.out.println();
		System.out.println("Ficha");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.printf("Salário: %.2f%n", salario);
		//gênero
		if(genero.equalsIgnoreCase("m")) {
			System.out.println("Gênero: Masculino");
		} else {
			System.out.println("Gênero: Masculino");
		}
		
		//estado civil
		switch(estadoCivil) {
		case "s": System.out.println("Estado civil: Solteiro"); break;
		case "c": System.out.println("Estado civil: Casado"); break;
		case "v": System.out.println("Estado civil: Viúvo"); break;
		case "d": System.out.println("Estado civil: Separado"); break;
		}
		
	}

}
