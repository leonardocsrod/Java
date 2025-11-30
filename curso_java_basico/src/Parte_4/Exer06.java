package Parte_4;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// 6. Desconto Aplicado
		// Crie um programa que calcula o preço com desconto. 
		// Receba o preço original e o percentual de desconto (ex: 15%). 
		// Use o operador de multiplicação * e subtração - para calcular
		// o valor final.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Preço do produto: ");
		float precoProduto = scan.nextFloat();
		float desconto = 15;
		float precoComDesconto = (precoProduto * (100 - desconto)/100);
		System.out.printf("Preço do produto: %.2f\n", precoProduto);
		System.out.println("Desconto[%]: " + desconto);
		System.out.printf("Preço final do produto: %.2f\n", precoComDesconto);
		
		scan.close();
	}

}
