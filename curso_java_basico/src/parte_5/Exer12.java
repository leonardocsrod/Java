package parte_5;

import java.util.Scanner;

public class Exer12 {
	static String conceito(float nota) {
		String conc = "";
		
		conc =  (nota >= 9) ? "A" :
				(nota >= 7) ? "B" :
				(nota >= 5)	? "C" :
							  "D";
		return conc;
	}

	public static void main(String[] args) {
		//12. Sistema de Notas (Operador Ternário + Função)
		//Crie uma função que recebe uma nota e retorna o conceito: 
		//"A" (>= 9), "B" (>= 7), "C" (>= 5) ou "D" (< 5). 
		//Use operadores ternários aninhados.

		Scanner scan = new Scanner(System.in);
		System.out.print("Nota: ");
		float nota = scan.nextFloat();
		
		String resultado = conceito(nota);
		
		System.out.println("Conceito: " + resultado);
		
		
		scan.close();
	}

}
