package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double horasTrabalhadasMes, valorHoraTrabalhada, salarioBruto, 
		salarioLiquido, impostoRenda, inss, descontoInss = 0.1, descontoSindicato = 0.03, 
		sindicato, descontoIR = 0, descontoFgts = 0.11, fgts, totalDescontos;
		
		System.out.println("Horas trabalhadas no mês: ");
		horasTrabalhadasMes = scan.nextDouble();
		System.out.println("Valor das horas trabalhadas: ");
		valorHoraTrabalhada = scan.nextDouble();
		
		salarioBruto = horasTrabalhadasMes * valorHoraTrabalhada;
		if(salarioBruto > 900 && salarioBruto <= 1500) {
			descontoIR = 0.05;
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			descontoIR = 0.1;
		} else if(salarioBruto > 2500) {
			descontoIR = 0.2;
		}
		
		impostoRenda = salarioBruto * descontoIR;
		
		sindicato = salarioBruto * descontoSindicato;
				
		inss = salarioBruto * descontoInss;
		
		fgts = salarioBruto * descontoFgts;
		
		totalDescontos = impostoRenda + sindicato + inss;
		
		salarioLiquido = salarioBruto - sindicato - impostoRenda - inss;
		System.out.println();
		System.out.println("Folha de pagamento");
		System.out.println();
		System.out.println("Salário Bruto\t\t: " + salarioBruto);
		System.out.println("(-) IR (" + (descontoIR * 100) + "%)\t\t: " + impostoRenda);
		System.out.println("(-) INSS (" + (descontoInss * 100) + "%)\t: " + inss);
		System.out.println("(-) Sindicato (" + (descontoSindicato * 100) + "%)\t: " + sindicato);
		System.out.println("FGTS (" + (descontoFgts * 100) + "%)\t\t: " + fgts);
		System.out.println("Total de descontos\t: " + totalDescontos);
		
			
		System.out.println("Salário líquido\t\t: " + salarioLiquido);
		scan.close();

	}

}
