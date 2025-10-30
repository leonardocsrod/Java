package parte_1;
import java.util.Scanner;

public class Exer22 {

	static boolean ehPrimo(int num) {
		int cont = 0;
		boolean primo = false;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			primo = true;
		}
		return primo;
	}
	public static void main(String[] args) {
		// Crie uma função ehPrimo que recebe um número e retorna true se ele for primo, false caso contrário.
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		boolean resultado = ehPrimo(numero);
		
		System.out.println("O número " + numero + " é primo: " + resultado);
		scan.close();
	}

}
