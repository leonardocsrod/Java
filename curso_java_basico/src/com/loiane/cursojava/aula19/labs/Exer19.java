package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] nota1 = new float[10];
		float[] nota2 = new float[10];
		float[] result = new float[10];
		String[] resultFinal = new String[10];
	
		//create vetors
		for(int i = 0; i < nota1.length; i++) {
			System.out.print("1º nota aluno " + (i + 1) + ": ");
			nota1[i] = scan.nextFloat();
			System.out.print("2º nota aluno " + (i + 1) + ": ");
			nota2[i] = scan.nextFloat();
			System.out.println();
			result[i] = (nota1[i] + nota2[i]) / 2;
			if(result[i] >= 7) {
				resultFinal[i] = "Aprovado";
			} else {
				resultFinal[i] = "Reprovado";
			}
		}
		
		scan.close();
		
		//print nota1
		for(int i = 0; i < nota1.length; i++) {
			if(i == 0) {
				System.out.print("Nota 1 = {" + nota1[i] + ", ");
			} else if(i > 0 && i < (nota1.length - 1)) {
				System.out.print(nota1[i] + ", ");
			} else {
				System.out.println(nota1[i] + "}");
			}
		}
		
		//print nota2
		System.out.println();
		for(int i = 0; i < nota1.length; i++) {
			if(i == 0) {
				System.out.print("Nota 2 = {" + nota2[i] + ", ");
			} else if(i > 0 && i < (nota1.length - 1)) {
				System.out.print(nota2[i] + ", ");
			} else {
				System.out.print(nota2[i] + "}");
			}
		}
		
		//print result
		System.out.println();
		for(int i = 0; i < nota1.length; i++) {
			if(i == 0) {
				System.out.print("Nota final = {" + result[i] + ", ");
			} else if(i > 0 && i < (nota2.length - 1)) {
				System.out.print(result[i] + ", ");
			} else {
				System.out.print(result[i] + "}");
			}
		}
		
		//print resultFinal
		System.out.println();
		for(int i = 0; i < nota1.length; i++) {
			if(i == 0) {
				System.out.print("Nota final = {" + resultFinal[i] + ", ");
			} else if(i > 0 && i < (nota2.length - 1)) {
				System.out.print(resultFinal[i] + ", ");
			} else {
				System.out.print(resultFinal[i] + "}");
			}
		}
	
	}

}
