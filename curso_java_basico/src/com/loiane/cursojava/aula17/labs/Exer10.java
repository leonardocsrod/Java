package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numeroInicial = scan.nextInt();
		System.out.println("Digite outro número: ");
		int numeroFinal = scan.nextInt();
		
		for(int i = numeroInicial; i <= numeroFinal; i++) {
			System.out.println(i);
		}
		
		scan.close();

	}

}
