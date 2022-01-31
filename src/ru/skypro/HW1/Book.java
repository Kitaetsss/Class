package ru.skypro.HW1;

public class Book {
    private String BookName;
    private Author Author;
    private int yearBook;

    public Book(String BookName, int yearBook, Author Author){
        this.BookName = BookName;
        this.yearBook = yearBook;
        this.Author = Author;
    }
    public String getBookName() {
        return BookName;
    }
    public int getYearBook() {
        return yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
    public String getAuthor() {
        return Author.getAuthorName();
    }
}
