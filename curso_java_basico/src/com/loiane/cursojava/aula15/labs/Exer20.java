package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		System.out.println("Responda as perguntas[s/n]");
		System.out.println("Telefonou para a vítima: ");
		String resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			cont++;
		}
		System.out.println("Esteve perto do local do crime: ");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			cont++;
		}
		System.out.println("Mora perto da vítima: ");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			cont++;
		}
		System.out.println("Devia para a vítima: ");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			cont++;
		}
		System.out.println("Já trabalhou com a vítima: ");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			cont++;
		}		
		
		System.out.println("Resultado da investivação: ");
		if(cont <= 1) {
			System.out.println("Você é inocente!");
		} else if(cont == 2) {
			System.out.println("Você é suspeito!");
		} else if(cont >= 3 && cont <= 4) {
			System.out.println("Você é cúmplice!");
		} else if(cont == 5) {
			System.out.println("Você é o assassino!");
		}
		
		scan.close();

	}

}
