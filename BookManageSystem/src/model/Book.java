package model;

public class Book {
	private int id;
	private String bookname;
	private String author;
	private float price;
	
	public Book(int id, String bookname, String author, float price) {
		this.setId(id);
		this.bookname = bookname;
		this.setAuthor(author);
		this.setPrice(price);
	}
	
	public String getBookname() {
		return this.bookname;
	}
	
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
