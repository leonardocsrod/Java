package parte_1;
import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		// Escreva um codigo que peça o nome do usuario e imprima "Ola, [nome]!".
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = scan.next();
		
		System.out.println("Ola, " + nome);
		
		scan.close();

	}

}
