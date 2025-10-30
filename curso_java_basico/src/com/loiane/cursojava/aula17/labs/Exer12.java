package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		int tabuada = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Tabuada[1-10]: ");
			tabuada = scan.nextInt();
		}while(tabuada < 0 || tabuada > 10);
		for(int i = 0; i <= 10; i++) {
			System.out.printf("%2d * %d = %2d%n", i, tabuada, (i * tabuada));
		}
		
		
		scan.close();

	}

}
