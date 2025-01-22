package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] grades = new int[10];
		
		Random random = new Random();
		
		
		for(int i = 0; i < grades.length; i++) {
			grades[i] = random.nextInt(11);
			System.out.println("i: " + i);
		}
		
		System.out.println();
		
		for(int grade : grades) {
			System.out.print(" " + grade);
		}

	}

}
