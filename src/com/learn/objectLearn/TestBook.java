package com.learn.objectLearn;

public class TestBook {

	public static void main(String[] args) {
		Book firstBook = new Book("123456");
		Book secondBook = new Book("123456");
		if(firstBook.equals(secondBook)){
			System.out.println("两本书由于版号一样，所以是同一本书！");
		}
	}
}
