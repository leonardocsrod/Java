package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//declaration array and variables
		String[][][] schedule = new String[31][12][8];
		int option = 0;
		boolean valid = false;
		int day = 0;
		int hour = 0;
		int month = 0;
		
		//methods
		Scanner scan = new Scanner(System.in);
		
		//print menu
		while(!valid) {
			System.out.println("CALENDAR");
			System.out.println("0 - OUT");
			System.out.println("1 - MAKE APPOINTMENT");
			System.out.println("2 - CHECK APPOINTMENT");
			System.out.print("OPTION: ");
			option = scan.nextInt();
			if(option == 0) {
				
				valid = true;
			} else if(option == 1) {
				System.out.println("Enter day: ");
				day = scan.nextInt();
				boolean validDay = false;				
				
				while(!validDay) {
					if(day > 0 && day <= 31) {
						validDay = true;						
					} else {
						System.out.println("Invalid day. Enter day again: ");
						day = scan.nextInt();
					}				
				}
				System.out.println("Enter month: ");
				month = scan.nextInt();
				boolean validMonth = false;	
				
				while(!validMonth) {
					if(month > 0 && month <= 12) {
						validMonth = true;						
					} else {
						System.out.println("Invalid month. Enter month again: ");
						month = scan.nextInt();
					}				
				}				
				
				System.out.println("Enter hour");
				hour = scan.nextInt();
				boolean validHour = false;	
				
				while(!validHour) {
					if(hour > 0 && hour <= 8) {
						validHour = true;						
					} else {
						System.out.println("Invalid hour. Enter hour again: ");
						hour = scan.nextInt();
					}				
				}
				day--;
				month--;
				System.out.println("Enter the schedule: ");
				schedule[day][month][hour] = scan.next();
				System.out.println("\n\n");
			} else if (option == 2) {
				System.out.println("Enter day: ");
				day = scan.nextInt();
				boolean validDay = false;				
				
				while(!validDay) {
					if(day > 0 && day <= 31) {
						validDay = true;						
					} else {
						System.out.println("Invalid day. Enter day again: ");
						day = scan.nextInt();
					}				
				}
				System.out.println("Enter month: ");
				month = scan.nextInt();
				boolean validMonth = false;	
				
				while(!validMonth) {
					if(month > 0 && month <= 12) {
						validMonth = true;						
					} else {
						System.out.println("Invalid month. Enter month again: ");
						month = scan.nextInt();
					}				
				}				
				
				System.out.println("Enter hour");
				hour = scan.nextInt();
				boolean validHour = false;	
				
				while(!validHour) {
					if(hour > 0 && hour <= 8) {
						validHour = true;						
					} else {
						System.out.println("Invalid hour. Enter hour again: ");
						hour = scan.nextInt();
					}				
				}
				day--;
				month--;
				System.out.println("Schedule: " + schedule[day][month][hour]);
				System.out.println("\n\n");
				
			} else {
				System.out.println("Option invalid");
				System.out.println("CALENDAR");
				System.out.println("0 - OUT");
				System.out.println("1 - MAKE APPOINTMENT");
				System.out.println("2 - CHECK APPOINTMENT");
				System.out.println("OPTION");
				option = scan.nextInt();
			}
				
			
		}
		
		scan.close();
		System.out.println("End of the program!");

	}

}
