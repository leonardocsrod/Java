package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite a nota[0-10]: ");
		numero = scan.nextInt();
		while(numero < 0 || numero > 10) {
			System.out.println("Nota inválida[0-10]: ");
			numero = scan.nextInt();
		}
		System.out.println("Nota: " + numero);
		
		scan.close();

	}

}
