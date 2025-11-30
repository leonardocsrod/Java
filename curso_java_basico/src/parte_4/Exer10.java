package parte_4;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		//10. Calculadora Básica
		//Peça dois números e um operador (+, -, *, /) ao usuário.
		//Implemente uma calculadora que, com base no operador fornecido, 
		//realize a operação correspondente e exiba o resultado.

		Scanner scan = new Scanner(System.in);
		System.out.print("Primeiro número: ");
		float numero1 = scan.nextFloat();
		
		System.out.print("Segundo número: ");
		float numero2 = scan.nextFloat();
		
		System.out.print("Operação[+-*/]: ");
		String operacao = scan.next();
		scan.close();

		float resultado = 0;
		
		if(operacao.equalsIgnoreCase("+")) {
			resultado = numero1 + numero2;
		} else if(operacao.equalsIgnoreCase("-")) {
			resultado = numero1 - numero2;
		} else if(operacao.equalsIgnoreCase("*")) {
			resultado = numero1 * numero2;
		}else if(operacao.equalsIgnoreCase("/")){
			resultado = numero1 / numero2;
		}
		System.out.println("O resultado da operação entre os números " + numero1 + " e " + numero2 + " é " + resultado);
	}

}
