package com.collection.part04_generics;

public class GenericsTest {

}


class Book{
	private String title;
	
	public Book() {	}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call....");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student{
	
	
}
class Car{
	
	
}