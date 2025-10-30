package parte_1;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		//Escreva uma estrutura `if-else` que verifique se um numero e positivo, negativo ou zero.
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("O numero e negativo.");
		} else if(numero == 0) {
			System.out.println("O numero e zero.");
		} else {
			System.out.println("O numero e positivo.");
		}
		
		
		scan.close();

	}

}
