package parte_2;

import java.util.Scanner;

public class Exer29 {
	
	static int fibonacci(int num) {
		if(num == 0) {
			return 0;
		} else if(num == 1) {
			return 1;
		}
		
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args) {
		// Crie uma função recursiva para calcular o n-ésimo número da sequência de Fibonacci.
		Scanner scan = new Scanner(System.in);
		System.out.print("Termo: ");
		int numero = scan.nextInt();
		
		int resultado = fibonacci(numero);
		System.out.println("O termo " + numero + " da sequência de fibonacci é: " + resultado);
		scan.close();

	}

}
