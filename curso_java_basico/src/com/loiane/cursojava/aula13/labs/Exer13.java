package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor por hora: ");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Horas trabalhadas por mês: ");
		double horasTrabalhadasMes = scan.nextDouble();
		
		double salarioBruto = valorPorHora * horasTrabalhadasMes;
		double impostoRenda = salarioBruto * 0.11;
		double seguridadeSocial = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - impostoRenda - seguridadeSocial - sindicato;
		
		
		System.out.println();
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("IR: " + impostoRenda);
		System.out.println("INSS: " + seguridadeSocial);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Salário líquido: " + salarioLiquido);
		
		
		
		scan.close();

	}

}
