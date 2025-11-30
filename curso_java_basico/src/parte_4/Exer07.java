package parte_4;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		//7. Verificação de Votação
		//Peça a idade do usuário e verifique se ele pode votar
		// (idade >= 16). Use operadores relacionais para determinar
		//se a idade é suficiente para votar.

		Scanner scan = new Scanner(System.in);
		System.out.print("Idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 16) {
			System.out.println("Pode votar!");
		} else {
			System.out.println("Não pode votar! Precisa completar 16 anos.");
		}
		
		scan.close();

	}

}
