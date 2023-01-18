package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado - 8;
		System.out.println(resultado);
		
		resultado = resultado % 3;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		++resultado;
		System.out.println(resultado);
		
		//resultado = 4
		System.out.println(resultado++);
		//resultado = 5
		System.out.println(++resultado);
		
		String primeiroNome = "Esta e";
		String segundoNome = " uma string concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
	}

}
