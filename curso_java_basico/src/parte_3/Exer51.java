package parte_3;

import java.util.Scanner;

public class Exer51 {

	public static void main(String[] args) {
		//  Escreva uma expressãoo ternária que retorna o valor absoluto
		// de um número (sem usar Math.abs()).
		Scanner scan = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = scan.nextInt();
		
		int numeroAbs = (numero >= 0) ? numero : numero * -1;
		
		System.out.println("Número absoluto: " + numeroAbs);
		scan.close();
	}

}
