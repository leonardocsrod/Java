package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Digit your age: ");
		int idade = scan.nextInt();
		if(idade >= 18) {
			System.out.println("Legal age!");
		} else {
			System.out.println("Not a legal age!");
		}
		*/
		
		System.out.println("What is the price?");
		double price = scan.nextDouble();
		
		if (price <= 10) {
			System.out.println("it's cheap!");
		} else if (price > 10 && price < 15) {
			System.out.println("I want a discount.");
		} else if (price >= 15 && price <= 17) {
			System.out.println("Another reserch.");
		} else {
			System.out.println("Too expensive!.");
		}
		

	}

}
