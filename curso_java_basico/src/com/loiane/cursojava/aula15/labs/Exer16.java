package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b = 0, c = 0, delta = 0, x = 0, x1, x2;
		
		System.out.println("Valor a: ");
		a = scan.nextDouble();
		
		if(a == 0) {
			System.out.println("Não é uma equação do 2º grau(a = 0).");
		} else {
			System.out.println("Valor b: ");
			b = scan.nextDouble();
			
			System.out.println("Valor c: ");
			c = scan.nextDouble();
			
			delta = Math.pow(b, 2) - (4 * a * c);
			System.out.println();
			System.out.println("Delta: " + delta);	
			
		}
		
		
		if(delta < 0) {
			System.out.println("A equação não tem raízes reais.");
		} else if(delta == 0) {
			x = (-b) / (2 * a);
			System.out.println("x: " + x);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("x1: " + x1);
			System.out.println("x2: " + x2);			
		}
		
		//x2 + 2x + 1
		// delta = b2 - 4ac
		//raízes: x' = (-b + raiz-delta) / 2*a e x'' = (-b - raiz-delta) / 2*a
		
		
		/*
		
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println();
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		
		
		*/
		scan.close();

	}

}
