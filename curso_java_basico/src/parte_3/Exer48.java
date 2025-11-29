package parte_3;

import java.util.Scanner;

public class Exer48 {

	public static void main(String[] args) {
		//Operadores ternários podem ser aninhados? 
		//Dê um exemplo que classifica uma nota como
		//"Excelente" (>= 9), "Bom" (>= 7) ou "Insuficiente" (< 7).

		Scanner scan = new Scanner(System.in);
		System.out.print("Nota: ");
		int nota = scan.nextInt();
		
		String resultado = (nota >= 7) ? (nota >= 9 ? "Excelente" : "Bom") : "Insuficiente" ; 
		
		System.out.println("Resultado: " + resultado);
		
		scan.close();

	}

}
