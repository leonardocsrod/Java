package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gênero[m-f]: ");
		String genero = scan.next();
		
		if(genero.equalsIgnoreCase("f")) {
			System.out.println("O gênero é feminino.");
		} else if(genero.equalsIgnoreCase("m")) {
			System.out.println("O gênero é masculino.");
		} else {
			System.out.println("Gênero inválido[m-f]");
		}
		
		scan.close();

	}

}
