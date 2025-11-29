package parte_3;

import java.util.Scanner;

public class Exer50 {

	public static void main(String[] args) {
		//Use o operador ternário para verificar se um número par ou
		// impar e atribua o resultado a uma String.
		Scanner scan = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = scan.nextInt();
		
		String resultado = (numero % 2 == 0) ? "Par": "Impar" ;
		
		System.out.println("Resultado: " + resultado);
		scan.close();

	}

}
