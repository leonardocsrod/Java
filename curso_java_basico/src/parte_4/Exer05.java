package parte_4;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		// 5. Número Dentro do Intervalo
		// Receba um número e verifique se ele está entre 10 e 20, 
		// inclusive. Use operadores lógicos (&&)- e relacionais (>=, <=).
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = scan.nextInt();
		
		if(numero >= 10 && numero <= 20) {
			System.out.println("O número está no intervalo de 10 a 20.");
		} else {
			System.out.println("O número NÃO está no intervalo de 10 a 20.");
		}
		
		
		scan.close();

	}

}
