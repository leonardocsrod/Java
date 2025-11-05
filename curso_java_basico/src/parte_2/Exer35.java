package parte_2;

import java.util.Scanner;

public class Exer35 {

	static boolean ePalindromo(String s, int inicio, int fim) {
		
		s = s.toLowerCase();
		if(inicio >= fim) {
			return true;
		}
		
		if(s.charAt(inicio) != s.charAt(fim)) {
			return false;
		}
		
		return ePalindromo(s, inicio + 1, fim - 1);
	}
	
	public static void main(String[] args) {
		//  Implemente uma função recursiva que verifica se uma String
		//é um palíndromo.
		Scanner scan = new Scanner(System.in);
		System.out.print("String 1: ");
		String s1 = scan.next();
		
		boolean palindromo = ePalindromo(s1, 0, s1.length() - 1);
		
		if(palindromo == true) {
			System.out.println("A palavra " + s1 + " é palíndromo.");
		} else {
			System.out.println("A palavra " + s1 + " não é palíndromo.");
			
		}
		
		
		
		scan.close();
		

	}

}
