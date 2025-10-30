package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String escolha;
		System.out.println("Qual turno você estuda[m - v - n]: ");
		escolha = scan.next();
		
		switch(escolha) {
		case "m": 
		case "M":   System.out.println("Bom dia!");
					break;		
		case "v": 
		case "V":   System.out.println("Boa tarde!");
					break;					
		case "n": 
		case "N":   System.out.println("Boa noite!");
					break;			
		default: 	System.out.println("Opção inválida[m - v - n]");
		}
		
		scan.close();
	}

}
