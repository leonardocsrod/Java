package parte_1;
import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		// Como ler um nÃºmero inteiro do usuÃ¡rio usando `Scanner`?
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		System.out.println("O numero digitado foi: " + numero);
		
		
		scan.close();

	}

}
