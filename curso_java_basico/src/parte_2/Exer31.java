package parte_2;

import java.util.Scanner;

public class Exer31 {
	
	static int somaNumeros(int num) {
		if(num == 1) {
			return 1;
		}

		return num + somaNumeros(num - 1);
	}

	public static void main(String[] args) {
		//  Implemente uma função recursiva que calcula a soma dos números de 1 até n.
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		
		int resultado = somaNumeros(numero);
		System.out.println("A soma dos número de 1 até " + numero + " é: " + resultado);
		
		
		scan.close();

	}

}
