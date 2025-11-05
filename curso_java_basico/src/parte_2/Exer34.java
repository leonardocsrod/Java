package parte_2;

import java.util.Scanner;

public class Exer34 {
	
	static double calculaPotencia(double n, double p) {
		if(p == 0) {
			return 1;
		} else {
			return n * calculaPotencia(n, p - 1);
		} 
		//double result = Math.pow(n, p);
		//return result;
	}
	
	public static void main(String[] args) {
		//  Crie uma função recursiva que calcula a potência de um número (x^n).
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Número: ");
		double numero = scan.nextDouble();
		System.out.print("Potência: ");
		double potencia = scan.nextDouble();
		
		double resultado = calculaPotencia(numero, potencia);
		System.out.println("Resultado: " + resultado);
		scan.close();
	}

}
