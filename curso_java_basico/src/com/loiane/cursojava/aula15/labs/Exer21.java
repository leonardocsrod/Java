package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double precoAlcool = 1.9;
		double precoGasolina = 2.5;
		double precoTotal = 0;
		
		System.out.println("Escolha o combustível[Álcool - A / Gasolina - G]: ");
		String combustivel = scan.next();
		System.out.println("Quantidade de combustível: ");
		double quantidade = scan.nextDouble();
		
		if(combustivel.equalsIgnoreCase("a")) {
			if(quantidade <= 20) {
				precoAlcool *= 0.97;
			} 
			if(quantidade > 20) {
				precoAlcool *= 0.95;
			}
			precoTotal = precoAlcool * quantidade;
		}
		
		if(combustivel.equalsIgnoreCase("g")) {
			if(quantidade <= 20) {
				precoGasolina *= 0.96;
			} if(quantidade > 20) {
				precoGasolina *= 0.94;
			}
			precoTotal = precoGasolina * quantidade;
		}
		
		System.out.println("O preço total é de " + precoTotal + " reais.");
		
		
		
		scan.close();

	}

}
