package parte_1;
import java.util.Scanner;

public class Exer24 {

	static int maiorNumero(int a, int b, int c) {
		int maior = 0;
		if(a > b && a > c) {
			maior = a;
		} else if(b > a && b > c) {
			maior = b;
		} else if(c > a && c > b) {
			maior = c;
		}
		return maior;
	}
	public static void main(String[] args) {
		//  Escreva uma função que recebe três números e retorna o maior deles.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Numero 2: ");
		int numero2 = scan.nextInt();

		System.out.print("Numero 3: ");
		int numero3 = scan.nextInt();
		
		int result = maiorNumero(numero1, numero2, numero3);
		
		System.out.println("O maior número digitado é: " + result);
		
		scan.close();
	}

}
