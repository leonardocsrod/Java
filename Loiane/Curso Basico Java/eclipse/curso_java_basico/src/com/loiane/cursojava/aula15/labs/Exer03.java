package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inform your gender[M/F]: ");
		String gender = scan.next();
		if (gender.equalsIgnoreCase("f")) {
			System.out.println("The gender is female!");
		} else if (gender.equalsIgnoreCase("m")) {
			System.out.println("The gender is male!");
		} else {
			System.out.println("Invalid gender!");
		}

	}

}
