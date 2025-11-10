package parte_2;

import java.util.Scanner;

public class Exer41 {
	public enum Status{
		PENDENTE,
		PROCESSANDO, 
		ENVIADO,
		ENTREGUE
	}

	public static void main(String[] args) {
		// Escreva um enum StatusPedido com valores PENDENTE, PROCESSANDO, ENVIADO e ENTREGUE. Adicione
		// um método que retorna uma descrição para cada status.
		Scanner scan = new Scanner(System.in);
		Status s = Status.ENTREGUE;
		System.out.println("Situação do pedido: ");
		System.out.println("1 - Pedido entregue.");
		System.out.println("2 - Pedido enviado.");
		System.out.println("3 - Pedido pendente.");
		System.out.println("4 - Pedido processando.");
		System.out.print("Opção: ");
		int st = scan.nextInt();
		
		switch(st) {
			case 1: s = Status.ENTREGUE; break;
			case 2: s = Status.ENVIADO; break;
			case 3: s = Status.PENDENTE; break;
			case 4: s = Status.PROCESSANDO; break;
		}
		
		if(s == Status.ENTREGUE) {
			System.out.println("Pedido entregue no local.");
		} else if(s == Status.ENVIADO) {
			System.out.println("O pedido foi enviado, mas ainda não foi entregue");
		} else if(s == Status.PENDENTE) {
			System.out.println("O pedido não foi despachado por falta de pagamento.");
		} else if(s == Status.PROCESSANDO) {
			System.out.println("Pedido aceito, encaminhado para despacho.");
		}
		
		
		
		scan.close();
	}

}
