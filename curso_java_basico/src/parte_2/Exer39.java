package parte_2;

import java.util.Scanner;

public class Exer39 {
	public enum Estacao{
		PRIMAVERA,
		VERÃO,
		OUTONO,
		INVERNO
	}

	public static void main(String[] args) {
		// Crie um programa que usa um enum Estacao (PRIMAVERA, VERAO, OUTONO, INVERNO) e imprime uma
		// mensagem diferente para cada estação usando switch-case.
		
		Scanner scan = new Scanner(System.in);
		Estacao e = Estacao.PRIMAVERA;
		System.out.print("Estação[p/v/o/i]: ");
		String nivel = scan.next();
		
		
					
		switch (nivel){
			case "p": e = Estacao.PRIMAVERA; break;
			case "v": e = Estacao.VERÃO; break;
			case "o": e = Estacao.OUTONO; break;
			case "i": e = Estacao.INVERNO; break;
					
		}			
			
		System.out.println("Estação: " + e);	
		System.out.println("Fim do programa");	
			
		scan.close();
	}
}
		
	

	


