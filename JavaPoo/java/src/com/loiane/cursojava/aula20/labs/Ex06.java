package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//declaration array and variable
		String[][] olderGame = new String[3][3];
		int count = 1;		
		boolean won = false;
		int move = 1;
		String signal = " ";
		int row = 0;
		int column = 0;
		
		//methods
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		for(int i = 0; i < olderGame.length; i++) {			
			for(int j = 0; j < olderGame[i].length; j++) {
				System.out.print("\t  " + count);
				count++;
				if(j < 2) {
					System.out.print("   |");
				}				
			}
			if(i < 2) {
				System.out.println("\n\t---------------------");
			}
			
		}
		System.out.println("\n\n\tLets play!\n\n");
		
		while(!won) {
			if(move % 2 != 0) {
				System.out.println("\n\nPlayer 1[X]: ");
				signal = "X";
				
			} else {
				System.out.println("\n\nPlayer 2[O]: ");
				signal = "O";
				
			}
		
			
			
		
		boolean validRow = false;
		while(!validRow) {
			System.out.print("Enter row[1 - 3]: ");	
			row = scan.nextInt();
			if(row >= 1 && row <= 3) {
				validRow = true;
			} else {
				System.out.print("Enter valid row[1 - 3]: ");
				
			}
		}

		boolean validColumn = false;
		while(!validColumn) {
			System.out.print("Enter column[1 - 3]: ");	
			column = scan.nextInt();
			if(column >= 1 && column <= 3) {
				validColumn = true;
			} else {
				System.out.print("Enter valid column[1 - 3]: ");
				
			}
		}
		
		column--;
		row--;
		
		if(olderGame[row][column] == "X" || olderGame[row][column] == "O") {
			System.out.println("Move used. Try another position.");
		} else {
			olderGame[row][column] = signal;
			move++;
		}
		
		//print table
		
		System.out.println();
		for(int i = 0; i < olderGame.length; i++) {			
			for(int j = 0; j < olderGame[i].length; j++) {
				System.out.print("  " + olderGame[i][j] + " ");
				
				if(j < 2) {
					System.out.print(" |");
				}				
			}
			if(i < 2) {
				System.out.println("\n\t---------------------");
			}
			
		}
		
		//check win
		if((olderGame[0][0] == "X" && olderGame[0][1] == "X" && olderGame[0][2] == "X") ||
		   (olderGame[1][0] == "X" && olderGame[1][1] == "X" && olderGame[1][2] == "X") ||
		   (olderGame[2][0] == "X" && olderGame[2][1] == "X" && olderGame[2][2] == "X") ||
		   (olderGame[0][0] == "X" && olderGame[1][0] == "X" && olderGame[2][0] == "X") ||
		   (olderGame[0][1] == "X" && olderGame[1][1] == "X" && olderGame[2][1] == "X") ||
		   (olderGame[0][2] == "X" && olderGame[1][2] == "X" && olderGame[2][2] == "X") ||
		   (olderGame[0][0] == "X" && olderGame[1][1] == "X" && olderGame[2][2] == "X") ||
		   (olderGame[0][2] == "X" && olderGame[1][1] == "X" && olderGame[2][0] == "X")) {
			System.out.println("\n\nPlayer1 won!");	
			won = true;
		} else if((olderGame[0][0] == "O" && olderGame[0][1] == "O" && olderGame[0][2] == "O") ||
				  (olderGame[1][0] == "O" && olderGame[1][1] == "O" && olderGame[1][2] == "O") ||
				  (olderGame[2][0] == "O" && olderGame[2][1] == "O" && olderGame[2][2] == "O") ||
				  (olderGame[0][0] == "O" && olderGame[1][0] == "O" && olderGame[2][0] == "O") ||
				  (olderGame[0][1] == "O" && olderGame[1][1] == "O" && olderGame[2][1] == "O") ||
				  (olderGame[0][2] == "O" && olderGame[1][2] == "O" && olderGame[2][2] == "O") ||
				  (olderGame[0][0] == "O" && olderGame[1][1] == "O" && olderGame[2][2] == "O") ||
				  (olderGame[0][2] == "O" && olderGame[1][1] == "O" && olderGame[2][0] == "O")) {
				  System.out.println("\n\nPlayer2 won!");	
				  won = true;
		} else if(move > 9) {
				System.out.println("\n\nDRAW!");
				won = true;
		}
			
		}
		scan.close();

	}

}
