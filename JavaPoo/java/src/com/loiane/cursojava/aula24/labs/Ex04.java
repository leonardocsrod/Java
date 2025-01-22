package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		LibraryBook book = new LibraryBook();
		book.name = "My book";
		book.author = "Me";
		book.isbn = "5668686";
		book.pagesQuantity = 998;
		book.yearLauch = 2015;
		
		book.bookFree = false;
		book.returnDate = new Date();
		book.borrowedTo = "Me again";
		
		System.out.println("Name of the book: " + book.name);
		System.out.println("Name of the author: " + book.author);
		System.out.println("ISBN of the book: " + book.isbn);	
		System.out.println("Quantity of the pages of the book: " + book.pagesQuantity);
		System.out.println("Year of the launch of the book: " + book.yearLauch);

	}

}
