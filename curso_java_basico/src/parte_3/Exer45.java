package parte_3;

import java.util.Scanner;

public class Exer45 {

	public static void main(String[] args) {
		// Reescreva o seguinte código usando operador ternário:
		// if (idade >= 18) {
		//	 status = "Maior de idade";
		//	} else {
		//	 status = "Menor de idade";
		//	}
		Scanner scan = new Scanner(System.in);
		System.out.print("Idade: ");
		
		int idade = scan.nextInt();
		
		String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		
		System.out.println("Status: " + status);

		scan.close();


	}

}
