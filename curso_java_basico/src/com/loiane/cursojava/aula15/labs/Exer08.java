package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mercado 1: ");
		System.out.println("Preço do produto 1: ");
		double precoProduto1 = scan.nextDouble();
		
		System.out.println("Mercado 2: ");
		System.out.println("Preço do produto 2: ");
		double precoProduto2 = scan.nextDouble();
		
		System.out.println("Mercado 3: ");
		System.out.println("Preço do produto 3: ");
		double precoProduto3 = scan.nextDouble();
		
		double menor = precoProduto1;
		
		if(precoProduto2 < menor) {
			menor = precoProduto2;
		}
		if(precoProduto3 < menor) {
			menor = precoProduto3;
		}
		
		if(menor == precoProduto1) {
			System.out.println("O menor preço é do mercado 1: " + precoProduto1);
		} else if(menor == precoProduto2) {
			System.out.println("O menor preço é do mercado 2: " + precoProduto2);
		} else if(menor == precoProduto3) {
			System.out.println("O menor preço é do mercado 3: " + precoProduto3);
		}
		
		scan.close();

	}

}
