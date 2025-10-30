package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Metros: ");
		double metros = scan.nextDouble();
		double centimetros;
		centimetros = metros * 100;
		System.out.println(metros + " possui " + (int)centimetros + " centimetros.");
		
		
		scan.close();

	}

}
