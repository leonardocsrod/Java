package parte_5;

import java.util.Scanner;

public class Exer13 {
	
	static int contaDigito(int numero) {
		int cont = 0;
		for(int i = 10; i <= numero; i *= 10) {
			cont++;
			if(numero % i < 1) {
				break;
			}			
		}
		return cont;
	}

	public static void main(String[] args) {
		//13. Contador Recursivo de Dígitos
		//Escreva uma função recursiva que conta quantos dígitos um número
		//possui (ex: 12345 tem 5 dígitos)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Número: ");
		int numero = scan.nextInt();
		int cont = 0;
		for(int i = 10; i <= numero; i *= 10) {
			cont++;
			if(numero / i < 1) {
				break;
			}			
		}
		System.out.println("Cont: " + (cont + 1));
		scan.close();

	}

}
