package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		String mediaLetra = "", conceito = "";
		
		System.out.println("Nota 1: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Nota 2: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		if(media > 9 && media <= 10) {
			mediaLetra = "A";
			conceito = "APROVADO";
		} else if(media > 7.5 && media <= 9) {
			mediaLetra = "B";
			conceito = "APROVADO";
		} else if(media > 6 && media <= 7.5) {
			mediaLetra = "C";
			conceito = "APROVADO";
		} else if(media > 4 && media <= 6) {
			mediaLetra = "D";
			conceito = "REPROVADO";
		}else if(media >= 0 && media <= 4) {
			mediaLetra = "E";
			conceito = "REPROVADO";
		}
		
		System.out.println("Média: " + media);
		System.out.println("Média: " + mediaLetra);
		System.out.println("Conceito: " + conceito);
		
		
		
		
		scan.close();

	}

}
