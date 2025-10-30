package com.loiane.cursojava.aula19.labs;

public class Exer01 {

	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5};
		int[] numeros2 = new int[5];
		for ( int i = 0; i < numeros.length; i++) {
			numeros2[i] = numeros[i];
		}

		for(int i = 0; i < numeros.length; i++) {
			System.out.print(" " + numeros2[i] );
		}
		

	}

}
