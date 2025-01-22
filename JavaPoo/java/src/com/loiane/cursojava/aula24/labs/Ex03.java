package com.loiane.cursojava.aula24.labs;

public class Ex03 {

	public static void main(String[] args) {
		BookstoreBook livroLivraria = new BookstoreBook();
		livroLivraria.name = "My book";
		livroLivraria.author = "Me";
		livroLivraria.isbn = "5668686";
		livroLivraria.pagesQuantity = 998;
		livroLivraria.yearLauch = 2015;
		
		System.out.println("Name of the book: " + livroLivraria.name);
		System.out.println("Name of the author: " + livroLivraria.author);
		System.out.println("ISBN of the book: " + livroLivraria.isbn);	
		System.out.println("Quantity of the pages of the book: " + livroLivraria.pagesQuantity);
		System.out.println("Year of the launch of the book: " + livroLivraria.yearLauch);

	}

}
