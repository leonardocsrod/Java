package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A letra é uma vogal.");
		} else {
			System.out.println("A letra é uma consoante.");
		}
		
		scan.close();

	}

}
