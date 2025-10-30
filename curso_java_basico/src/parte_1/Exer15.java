package parte_1;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		//  Escreva um código que some todos os elementos de um array de inteiros.
		int soma = 0;
		int[] valores = new int[4];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < valores.length;i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			valores[i] = scan.nextInt();
			soma += valores[i];
		}
		
		System.out.print("Valores: ");
		for(int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
		System.out.println("A soma dos valores do array e: " + soma);
		
		
		scan.close();

	}

}
