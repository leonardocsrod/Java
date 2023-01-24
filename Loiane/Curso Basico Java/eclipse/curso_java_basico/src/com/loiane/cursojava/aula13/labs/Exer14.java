package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tamanho do arquivo[MB]: ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Velocidade da internet[Mbps]: ");
		double velocidadeInternet = scan.nextDouble();
		double resultado = (tamanhoArquivo / velocidadeInternet);
		System.out.println("O arquivo será baixado em " + resultado);

	}

}
