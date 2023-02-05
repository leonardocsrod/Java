package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Day of the week[1-7]: ");
		int day = scan.nextInt();
		switch(day) {
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thusday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("Não é um dia valido");
		
		
		}

	}

}
