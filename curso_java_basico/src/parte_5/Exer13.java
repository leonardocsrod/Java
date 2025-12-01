package parte_5;

import java.util.Scanner;

public class Exer13 {
	
	static int contaDigito(int numero) {
		if(numero < 10) {
			return 1;
		}
		
		return 1 + contaDigito(numero / 10);
	}

	public static void main(String[] args) {
		//13. Contador Recursivo de Dígitos
		//Escreva uma função recursiva que conta quantos dígitos um número
		//possui (ex: 12345 tem 5 dígitos)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Número: ");
		int numero = scan.nextInt();
		
		int resultado = contaDigito(numero);
		
		System.out.println("Cont: " + resultado);
		scan.close();

	}

}
