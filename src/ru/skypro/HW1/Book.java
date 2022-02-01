package ru.skypro.HW1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Objects;

public class Book {
    private final String BookName;
    private final Author Author;
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
    public String toString() {
        return "Книга " + this.BookName + " год издания " + this.yearBook + " автор " + getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(BookName, book.BookName) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BookName, Author, yearBook);
    }
}
