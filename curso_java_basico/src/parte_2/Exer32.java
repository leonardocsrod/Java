package parte_2;

import java.util.Scanner;

public class Exer32 {

	static String inverterString(String s) {
		
		
		if(s.length() <= 1) {
			return s;
		} else {
			return s.charAt(s.length() - 1) + inverterString(s.substring(0, s.length() - 1));
		}
		
		
	}
	
	public static void main(String[] args) {
		//  Escreva uma função recursiva que inverte uma String.
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scan.next();
		
		String nomeInvertido = inverterString(nome);
		
		System.out.println("Nome invertido: " + nomeInvertido);
		
		scan.close();


	}

}
