package ru.skypro.HW1;

public class Book{
    String BookName;
    Author Author;
    int yearBook;

    public Book(String BookName, int yearBook, Author Author){
        this.BookName = BookName;
        this.yearBook = yearBook;
        this.Author = Author;
    }
    public String getBookName() {
        return BookName;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
