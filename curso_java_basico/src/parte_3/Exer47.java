package parte_3;

import java.util.Scanner;

public class Exer47 {

	public static void main(String[] args) {
		//Escreva uma expressÃ£o com operador ternário que retorna
		//"Aprovado" se a nota for >= 7, e "Reprovado" caso contrário.
		Scanner scan = new Scanner(System.in);
		System.out.println("Nota: ");
		int nota = scan.nextInt();
		
		String status = (nota >= 7) ? "Aprovado" : "Reprovado";
		
		System.out.println("Status: " + status);
		scan.close();

	}

}
