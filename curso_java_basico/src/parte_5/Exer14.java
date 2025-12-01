package parte_5;

import java.util.Scanner;

public class Exer14 {
	
	public enum OpcaoMenu{
		ADICIONAR, 
		REMOVER, 
		LISTAR, 
		SAIR;
	}

	public static void main(String[] args) {
		//14. Menu com Enum
		//Crie um enum OpcaoMenu (ADICIONAR, REMOVER, LISTAR, SAIR). 
		//Implemente um menu que usa switch-case com o enum para 
		//executar diferentes ações
		Scanner scan = new Scanner(System.in);
		
		OpcaoMenu o = OpcaoMenu.ADICIONAR;
		int escolha = 0;
		do {
		System.out.println("Opções");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Sair");
		System.out.print("Escolha: ");
		escolha = scan.nextInt();
		
		switch(escolha) {
		case 1: o = OpcaoMenu.ADICIONAR; break;
		case 2: o = OpcaoMenu.REMOVER; break;
		case 3: o = OpcaoMenu.LISTAR; break;
		case 4: o = OpcaoMenu.SAIR; break;
		default: System.out.println("Opção inexistente");		
		}
		}while(escolha < 1 || escolha > 4);
		
		System.out.println("Você escolheu a opção: " + o);
		scan.close();
	}

}
