package NthD.ravi.objectPool;

import java.io.Serializable;

public class Library implements Serializable
{
private String books;
private String bookID;
public String getBooks() {
	return books;
}
public void setBooks(String books) {
	this.books = books;
}
public String getBookID() {
	return bookID;
}
public void setBookID(String bookID) {
	this.bookID = bookID;
}

}
