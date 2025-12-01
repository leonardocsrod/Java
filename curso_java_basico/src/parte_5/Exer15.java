package parte_5;

import java.util.Scanner;

public class Exer15 {
	
	static String validaSenha(String senha) {
		String resultado = (senha.length() >= 8) ? "Senha válida" : "Senha inválida, menos de oito caracteres";
		return resultado;
	}	

	public static void main(String[] args) {
		//15. Validador de Senha (Função + Operador Ternário)
		//Escreva uma função que valida uma senha: deve ter no mínimo 8 
		//caracteres. Use operador ternário para retornar "Senha válida" 
		//ou "Senha inválida".
		Scanner scan = new Scanner(System.in);
		System.out.print("Senha: ");
		String senha = scan.next();
		
		String resultado = validaSenha(senha);
		System.out.println(resultado);	
		scan.close();

	}

}
