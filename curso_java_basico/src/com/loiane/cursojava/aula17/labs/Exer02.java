package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean validaSenha = false;
				
		do {
			System.out.println("Nome: ");
			String nome = scan.next();
			System.out.println("Senha: ");
			String senha = scan.next();
			if(senha.equalsIgnoreCase(nome)) {
				System.out.println("Senha não é valida.");
			} else {
				System.out.println("Senha validada.");
				validaSenha = true;
			}
		} while(!validaSenha);
		
		
		scan.close();
		System.out.println("Sistema encerrado.");
	}

}
