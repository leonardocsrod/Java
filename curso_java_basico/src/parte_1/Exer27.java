package parte_1;
import java.util.Scanner;

public class Exer27 {

	static int contaVogais(String s) {
		int cont = 0;
		String vogais = "AaEeIiOoUu";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(vogais.indexOf(c) != -1) {
				cont++;
			}
		}		
		
		return cont;
	}
	public static void main(String[] args) {
		//  Escreva uma função contarVogais que recebe uma String e retorna quantas vogais ela contém.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scan.next();
		
		int resultado = contaVogais(nome);
		System.out.println("O nome " + nome + " tem " + resultado + " vogais.");
		
		scan.close();
		
	}

}
