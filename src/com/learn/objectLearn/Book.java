package com.learn.objectLearn;

public class Book {

	private String ISBN;

	Book(String isbn) {
		this.ISBN = isbn;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			return ISBN.equals(((Book) obj).getISBN());
		} else {
			return false;
		}
	}
}
