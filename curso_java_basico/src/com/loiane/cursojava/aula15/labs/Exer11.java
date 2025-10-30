package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario;
		System.out.println("Informe o salário: ");
		
		salario = scan.nextDouble();
		System.out.println("Salario antes do reajuste: " + salario);
		
		if(salario <= 280) {
			salario *= 1.20;
		}else if(salario > 280 && salario <= 700) {
			salario *= 1.15;
		}else if(salario > 700 && salario <= 1500) {
			salario *= 1.1;
		}else if(salario > 1500) {
			salario *= 1.05;
		}
		
		System.out.println("Salário após o reajuste: " + salario);
		scan.close();

	}

}
