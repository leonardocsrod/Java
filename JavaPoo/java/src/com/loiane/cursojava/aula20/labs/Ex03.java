package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// declaration array and variable
		int[][] a = new int[3][3];
		int[] aPair = new int[9];
		int[] aOdd = new int[9];
		int number = 0;
		int posPair = 0;
		int posOdd = 0;
		int countPair = 0;
		int countOdd = 0;
		
		//methods
		Scanner scan = new Scanner(System.in);
		
		//initialization array
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "]: ");
				number = scan.nextInt();
				a[i][j] = number;
				if(number % 2 == 0) {
					aPair[posPair] = number;
					posPair++;
					countPair++;
				} else {
					aOdd[posOdd] = number;
					posOdd++;
					countOdd++;
				}
				}
		}
		scan.close();
		
		//print array
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i == 0 && j == 0) {
					System.out.print("a: \n" + a[i][j] + " ");
				} else if(j == a[i].length - 1) {
					System.out.println(a[i][j]);
				} else {
					System.out.print(a[i][j] + " ");
				}				
			}
		}
		
		for(int i = 0; i < posPair; i++) {
			if(i == 0) {
				System.out.print("\nVector aPair = {" + aPair[i] + ", ");
			} else if(i == posPair - 1) {
				System.out.println(aPair[i] + "}");
			} else {
				System.out.print(aPair[i] + ", ");
			}
		}
		
		for(int i = 0; i < posOdd; i++) {			
			if(i == 0) {
				System.out.print("\nVector aOdd = {" + aOdd[i] + ", ");
			} else if(i == posOdd - 1) {
				System.out.println(aOdd[i] + "}");
			} else {
				System.out.print(aOdd[i] + ", ");
			}
		}
		System.out.println("\n Quantity of odd numbers: " + countOdd);
		System.out.println("\n Quantity of pair numbers: " + countPair);
		
	}

}
