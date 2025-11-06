package parte_2;

import java.util.Scanner;

public class Exer38 {
	
	public enum Prioridade{
		BAIXA,
		MÉDIA,
		ALTA
	}

	public static void main(String[] args) {
		// Escreva um enum Prioridade com valores BAIXA, MEDIA e ALTA. Adicione um atributo inteiro para
		//cada nível.
		Scanner scan = new Scanner(System.in);
		int nivel = 0;
		Prioridade p = Prioridade.ALTA;	
		System.out.println("Nível de prioridade[1-2-3]: ");
		nivel = scan.nextInt();
		switch(nivel) {
		case 1: p = Prioridade.BAIXA; break;
		case 2: p = Prioridade.MÉDIA; break;
		case 3: p = Prioridade.ALTA; break;
		}
		
		System.out.println("A prioridade é " + p);
		scan.close();

	}

}
