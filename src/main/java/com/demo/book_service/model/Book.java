package com.demo.book_service.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookTitle;
	private String bookPrice;
	private LocalDate bookPublished;
	private String bookImageUrl;
	private String bookAuthurId;

	public Book() {
	}

	public Book(String bookTitle, int bookId, String bookPrice, LocalDate bookPublished, String bookImageUrl, String bookAuthurId) {
		this.bookTitle = bookTitle;
		this.bookId = bookId;
		this.bookPrice = bookPrice;
		this.bookPublished = bookPublished;
		this.bookImageUrl = bookImageUrl;
		this.bookAuthurId = bookAuthurId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public LocalDate getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(LocalDate bookPublished) {
		this.bookPublished = bookPublished;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	public String getBookAuthurId() {
		return bookAuthurId;
	}

	public void setBookAuthurId(String bookAuthurId) {
		this.bookAuthurId = bookAuthurId;
	}
}
