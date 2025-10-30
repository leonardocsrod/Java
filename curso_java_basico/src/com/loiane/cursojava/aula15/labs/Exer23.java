package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean cartao = false;
		String cartaoCredito;
		double precoCarne = 0;
		double quantidade = 0;
		double precoTotal = 0;
		double descontoCartao = 0;
		double precoCDesconto = 0;
		
		System.out.printf("Tipo carne: \nFile Duplo: F\nAlcatra: A\nPicanha: P\n");
		System.out.println("");
		System.out.println("Opção: ");
		String tipoCarne = scan.next();
		System.out.println("Pagamento no cartão de crédito[s/n]: ");
		cartaoCredito = scan.next();
		if(cartaoCredito.equalsIgnoreCase("s")) {
			cartao = true;
		} else if(cartaoCredito.equalsIgnoreCase("n")) {
			cartao = false;
		}
		
		if(tipoCarne.equalsIgnoreCase("f")) {
			tipoCarne = "Filé Duplo";
			System.out.println("Carne escolhida: " + tipoCarne);
			System.out.println("Quantidade[Kg]: ");
			quantidade = scan.nextDouble();
			if(quantidade <= 5) {
				precoCarne = 4.9;
			} else {
				precoCarne = 5.8;
			}			
			precoTotal = precoCarne * quantidade;
		}
		
		if(tipoCarne.equalsIgnoreCase("a")) {
			tipoCarne = "Alcatra";
			System.out.println("Carne escolhida: " + tipoCarne);
			System.out.println("Quantidade[Kg]: ");
			quantidade = scan.nextDouble();
			if(quantidade <= 5) {
				precoCarne = 5.9;
			} else {
				precoCarne = 6.8;
			}			
			precoTotal = precoCarne * quantidade;
		}
		if(tipoCarne.equalsIgnoreCase("p")) {
			tipoCarne = "Picanha";
			System.out.println("Carne escolhida: " + tipoCarne);
			System.out.println("Quantidade[Kg]: ");
			quantidade = scan.nextDouble();
			if(quantidade <= 5) {
				precoCarne = 6.9;
			} else {
				precoCarne = 7.8;
			}			
			precoTotal = precoCarne * quantidade;
		}			
		
		System.out.println();		
		
		if(tipoCarne.equalsIgnoreCase("f")) {
			
		}
		
		scan.close();
		System.out.println("Cupom fiscal");
		System.out.println("Tipo de carne: " + tipoCarne);
		System.out.printf("Preço unitário: %.2f%n", precoCarne);
		System.out.printf("Quantidade[Kg]: %.2f%n", quantidade);
		if(cartao) {
			descontoCartao = precoTotal * 0.05;
			System.out.println("Pagamento: Cartão de crédito");
			System.out.printf("Preço total: R$ %.2f%n", precoTotal);
			System.out.printf("Desconto: %.2f%n", descontoCartao);
			precoCDesconto = precoTotal - descontoCartao;
			System.out.printf("Preço com desconto: %.2f%n", precoCDesconto);
			
		} else {
			System.out.println("Pagamento: Dinheiro");
			System.out.printf("Preço total: R$ %.2f%n", precoTotal);
		}	

	}

}
