package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letter: ");
		String letter = scan.next();
		/*
		if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") ||  letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
			System.out.println("The letter" + letter + " is a vogal!");			
		} else {
			System.out.println("The letter" + letter + " is a consonant!");
		}
		*/
		if(letter.length() == 1) {
			switch(letter) {
			case "a":
			case "e": 
			case "i": 
			case "o":
			case "u":
			case "A":
			case "E": 
			case "I": 
			case "O":
			case "U":System.out.println(letter + " - vogal!"); break;
			default: System.out.println(letter + " - consonant!");			
			}
		} else {
			System.out.println("Digit only a letter!");
		}				
	}

}
