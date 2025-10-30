package parte_1;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// Escreva uma expressÃ£o que verifique se um numero e par usando o operador `%`
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O numero " + numero + " e par.");
		} else {
			System.out.println("O numero " + numero + " e impar.");
		}
		
		scan.close();
		
	}

}
