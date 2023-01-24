package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Salario por hora: ");
		double salarioHora = scan.nextDouble();
		System.out.println("Horas trabalhadas por mes: ");
		double horasTrabalhadas = scan.nextDouble();
		double salarioMes = salarioHora * horasTrabalhadas;
		double impostoRenda = salarioMes * 0.11;		
		double inss = salarioMes * 0.08;
		double sindicato = salarioMes * 0.05;
		double salarioLiquido = salarioMes - impostoRenda - inss - sindicato;
		System.out.println("Salario bruto: " + salarioMes);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Salario liquido: " + salarioLiquido);
		
		
	}

}
