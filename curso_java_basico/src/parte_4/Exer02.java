package parte_4;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// 2. Calculadora de Média
		//Receba três números do usuário e calcule a média aritmética. 
		//Use operadores aritméticos (+,-) para fazer o cálculo.
		Scanner scan = new Scanner(System.in);
		System.out.print("Primeiro número: ");
		float numero1 = scan.nextFloat();
		
		System.out.print("Segundo número: ");
		float numero2 = scan.nextFloat();
		
		System.out.print("Terceiro número: ");
		float numero3 = scan.nextFloat();
		
		float media = (numero1 + numero2 + numero3) / 3;
		
		System.out.printf("A média entre os três números é %.2f", media);
		scan.close();

	}

}
