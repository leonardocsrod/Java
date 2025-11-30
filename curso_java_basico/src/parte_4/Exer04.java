package parte_4;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// 4. Comparação de Idade
		//Receba duas idades e determine qual é maior, ou se são iguais. 
		//Use operadores relacionais (>, <,	==) para comparar as idades.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Idade 1: ");
		int idade1 = scan.nextInt();
		int maior = idade1;
		
		System.out.print("Idade 2: ");
		int idade2 = scan.nextInt();
		if(idade2 > maior) {
			maior = idade2;
		}
		
		System.out.println("A maior idade é " + maior + " anos.");
		
		scan.close();
	}

}
