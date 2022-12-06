package de.telrun.khakov.rustam.lesson7;

/**
 * @author Rustam Khakov
 */
public class Book {
	private int page;
	private String name;
	private String author;


	public Book(int page, String name, String author) {
		this.page = page;
		this.name = name;
		this.author = author;
	}

	public Book(int page, String name) {
		this.page = page;
		this.name = name;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
}
