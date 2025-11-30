package parte_4;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// 1. Soma Simples
		//Escreva um programa que recebe dois números inteiros do usuário
		//e exibe a soma deles. Use o operador +.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Segundo número: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + soma + ".");
		scan.close();
	}

}
