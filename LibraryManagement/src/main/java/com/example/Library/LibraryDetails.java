package com.example.Library;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LibraryDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int book_id;
	public LibraryDetails() {
		
	}
	public LibraryDetails(int book_id, String title, String author, String publishedDate, double price) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.publishedDate = publishedDate;
		this.price = price;
	}
	@Column
	   private String title;
	@Column
	    private String author;
	@Column
	    private String publishedDate;
	@Column
	    private double price;
	   public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	    
}
