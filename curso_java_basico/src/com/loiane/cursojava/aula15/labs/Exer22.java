package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double precoMorango = 0;
		double precoMaca = 0;		
		double pesoTotal = 0;
		double valorMorango = 0;
		double valorMaca = 0;
		double valorTotal = 0;
		double desconto = 0.9;
		
		System.out.println("Morango");
		System.out.println("Peso[Kg]: ");
		double peso = scan.nextDouble();	
		pesoTotal += peso;
		
		if(peso <= 5) {
			precoMorango = 2.5;
		} else {
			precoMorango = 2.2;
		}
		valorMorango = peso * precoMorango;
		System.out.println("Valor Morango: " + valorMorango);
		
		System.out.println("Maçã");
		System.out.println("Peso[Kg]: ");
		peso = scan.nextDouble();
		pesoTotal += peso;
		if(peso <= 5) {
			precoMaca = 1.8;
		} else {
			precoMaca = 1.5;
		}
		
		valorMaca = peso * precoMaca;
		
		valorTotal = valorMaca + valorMorango;
		
		System.out.println("Preço Maça: " + valorMaca);
		
		System.out.println("Peso total: " + pesoTotal);
		System.out.println("Preço total: " + valorTotal);
		
		if(pesoTotal > 8 || valorTotal > 25) {
			valorTotal *= desconto;
			System.out.println("Preço total após desconto: " + valorTotal);
		}
		
		
		scan.close();

	}

}
