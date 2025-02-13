package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		//methods
		Random numberRandom = new Random();
		//variable and arrays
		int[][] a = new int[10][10];
		int bigger5 = 0;
		int bigger5i = 0;
		int smaller5 = 9;
		int smaller5i = 0;
		int bigger7 = 0;
		int bigger7i = 0;		
		int smaller7 = 9;
		int smaller7i = 0;
		
		
		//create the array
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = numberRandom.nextInt(10);				
					
			}
		}
		
		//row 5
		for(int i = 0; i < a[5].length; i++) {
			if(a[4][i] > bigger5) {
				bigger5 = a[4][i];
				bigger5i = i;
	
			} else if(a[4][i] < smaller5) {
				smaller5 = a[4][i];
				smaller5i = i;
			}
		}
		
		//column 7
		for(int i = 0; i < a.length;i++) {
			if(a[i][7] > bigger7) {
				bigger7 = a[i][7]; 
				bigger7i = i;
			} else if(a[i][7] < smaller7) {
				smaller7 = a[i][7];
				smaller7i = i;
			}
		}
		
		
		
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
		
		//print results
		System.out.println("\nThe smaller number in the row 5 is " + smaller5 +" in the position a[4][" + smaller5i + "].");
		System.out.println("\nThe bigger number in the row 5 is " + bigger5 +" in the position a[4][" + bigger5i + "].");
		System.out.println("\nThe smaller number in the column 7 is " + smaller7 +" in the position a[" + smaller7i + "][7].");
		System.out.println("\nThe bigger number in the column 7 is " + bigger7 +" in the position a[" + bigger7i + "][7].");
	
	}

}
