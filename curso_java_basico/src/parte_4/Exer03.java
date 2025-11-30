package parte_4;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		//3. Par ou ímpar
		//Peça um número ao usuário e determine se ele é par ou ímpar.
		//Use o operador de módulo % para verificar o resto da divisãpor 2.

		Scanner scan = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}
		
		
		scan.close();
	}

}
