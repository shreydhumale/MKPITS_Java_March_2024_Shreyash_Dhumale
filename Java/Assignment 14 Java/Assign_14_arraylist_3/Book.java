package Assign_14_arraylist_3;

public class Book implements Comparable<Book> {
	private String bookName;
	private String isbn;
	private String author;
	private String yearPublished;
	//getter methods
	public String getBookName() {
		return bookName;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	public String getYearPublished() {
		return yearPublished;
	}
	//constructor for initialization
	public Book(String bookName,String isbn,String auther, String yearPublished) {
		this.bookName=bookName;
		this.isbn=isbn;
		this.author=auther;
		this.yearPublished=yearPublished;
	}
	@Override
	public String toString() {
		return  "Book bookName=" + bookName + 
				"isbn=" + isbn + 
				"author=" + author + 
				"yearPublished=" + yearPublished;
	}
	@Override
	public int compareTo(Book o) {
		return yearPublished.compareTo(o.getYearPublished());
	}
}
