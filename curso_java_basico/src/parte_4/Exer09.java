package parte_4;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		//9. Verificação de Maioridade
		//Peça duas idades e verifique se ambas as pessoas são maiores
		//de idade (>= 18). Use operadores lógicos (&&) e relacionais
		//para fazer a verificação.

		Scanner scan = new Scanner(System.in);
		System.out.print("Idade 1: ");
		int idade1 = scan.nextInt();
		
		System.out.print("Idade 2: ");
		int idade2 = scan.nextInt();
		
		if(idade1 >= 18 && idade2 >= 18) {
			System.out.println("Ambos são maiores de idade!");
		} else if (idade1 >= 18 && idade2 < 18){
			System.out.println("Somente o primeiro é maior de idade!");
		} else if(idade1 < 18 && idade2 >= 18) {
			System.out.println("Somente o segundo é maior de idade!");
		} else {
			System.out.println("Ambos são menores de idade!");

		}
		
		
		scan.close();

	}

}
