package parte_3;

import java.util.Scanner;

public class Exer46 {

	public static void main(String[] args) {
		// Use o operador ternário para determinar o maior 
		//entre dois números.
		
		int maior = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Primeiro numero: ");
		int numero1 = scan.nextInt();
		maior = numero1;
		
		System.out.print("Segundo numero: ");
		int numero2 = scan.nextInt();
		
		maior = (numero2 >= maior) ? numero2 :  numero1;
		
		System.out.println("Maior número: " + maior);
		
		scan.close();

	}

}
