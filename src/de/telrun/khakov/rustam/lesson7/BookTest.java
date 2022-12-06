package de.telrun.khakov.rustam.lesson7;

/**
 * @author Rustam Khakov
 */
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book(134, "Garry Potter", "Rouling");
		book.getAuthor();
		book.setAuthor("Another new author");

	}
}
