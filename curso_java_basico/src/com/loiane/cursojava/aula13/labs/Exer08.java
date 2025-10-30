package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor por hora trabalhada: ");
		double vlrHoraTrabalhada = scan.nextDouble();
		
		System.out.println("Horas trabalhadas no mês: ");
		double horasTrabalhadasMes = scan.nextDouble();
		
		double salario = vlrHoraTrabalhada * horasTrabalhadasMes;
		
		System.out.println("Valor da hora trabalhada: " + vlrHoraTrabalhada);
		System.out.println("Horas trabalhadas no mês: " + horasTrabalhadasMes);
		System.out.println("Valor das horas trabalhadas x Salário[Horas trabalhada]: R$ " + salario);
		scan.close();

	}

}
