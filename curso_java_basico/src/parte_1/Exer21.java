package parte_1;
import java.util.Scanner;

public class Exer21 {

	static int calculaQuadrado(int x) {
		int resultado = x * x;
		return resultado;
	}
	public static void main(String[] args) {
		//  Escreva uma funçao chamada calcularQuadrado que recebe um numero inteiro e retorna seu quadrado.
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int numero = scan.nextInt();
		int result = calculaQuadrado(numero);
		
		System.out.println("O quadrado do numero " + numero + " e: " + result);
		
		scan.close();
		
		
	}

}
