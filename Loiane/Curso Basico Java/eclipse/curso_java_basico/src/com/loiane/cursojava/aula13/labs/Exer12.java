package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the hight: ");
		double hight = scan.nextDouble();
		double weight = (hight * 72.7) - 58;
		System.out.println("The ideal weight is " + weight);

	}

}
