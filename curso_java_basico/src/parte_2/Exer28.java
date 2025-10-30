package parte_2;

import java.util.Scanner;

public class Exer28 {
	
	static int fatorial(int num) {
		if(num == 1 || num == 0) {
			return 1;
		} 
		
		return num * fatorial(num -1);
	}

	public static void main(String[] args) {
		// Escreva uma função recursiva que calcula o fatorial de um número.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		int resultado = fatorial(numero);
		
		System.out.println("O fatoria no número " + numero + " é: " + resultado);
		scan.close();

	}

}
